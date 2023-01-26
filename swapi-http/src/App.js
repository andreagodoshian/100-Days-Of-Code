import React, { useState, useCallback } from "react";

import MoviesList from "./components/MoviesList";
import "./App.css";

function App() {
  const [movies, setMovies] = useState([]);
  const [isLoading, setIsLoading] = useState(false);
  const [error, setError] = useState(null);

  const fetchMoviesHandler = useCallback(async () => {
    setIsLoading(true); // bc they clicked
    setError(null); // to be safe

    try {
      const response = await fetch("https://swapi.dev/api/films");
      if (!response.ok) throw new Error("Something went wrong!");
      // NOTE: error is **thrown** not caught
      const data = await response.json();
      const transformedMovies = data.results.map(x => {
        return {
          id: x.episode_id,
          title: x.title,
          openingText: x.opening_crawl,
          releaseDate: x.release_date,
        }});
      setMovies(transformedMovies);

    } catch (error) {
      setError(error.message);
    }

    setIsLoading(false);
  }, []);

  let content = <p>Found no movies 🫥</p>;
  if (movies.length > 0) content = <MoviesList movies={movies}/>
  if (error) content = <p>{error}</p>
  if (isLoading) content = <p>Loading, please wait...</p>

  return (
    <React.Fragment>
      <section>
        <button onClick={fetchMoviesHandler}>Fetch Movies</button>
      </section>
      <section>
        {content}
      </section>
    </React.Fragment>
  );
}

export default App;
