import React, {useState, useEffect, useCallback} from 'react';

import IngredientForm from './IngredientForm';
import IngredientList from "./IngredientList";
import Search from './Search';

function Ingredients() {
  const [userIngredients, setUserIngredients] = useState([]);

  // GET request
  useEffect(() => {
    fetch("https://intro-to-reactjs-default-rtdb.firebaseio.com/ingredients.json")
    .then(response => response.json())
    .then(responseData => {
      const loadedIngredients = [];
      for (const key in responseData) {
        loadedIngredients.push({
          id: key,
          title: responseData[key].title,
          amount: responseData[key].amount
        })};
        setUserIngredients(loadedIngredients);
    });
  }, []);

  // POST request
  const addIngredientHandler = ingredient => {
    fetch("https://intro-to-reactjs-default-rtdb.firebaseio.com/ingredients.json", {
      method: "POST",
      body: JSON.stringify(ingredient),
      headers: {"Content-Type": "application/json"}
    }).then(response => {
      return response.json()
    }).then(responseData => {
      setUserIngredients(prevIngredients => 
        [...prevIngredients, 
          {id: responseData.name, ...ingredient}])
      })
  }

  // SEARCH function
  const filteredIngredientsHandler = useCallback(filteredIngredients => {
    setUserIngredients(filteredIngredients);
  }, []);

  return (
    <div className="App">
      <IngredientForm onAddIngredient={addIngredientHandler}/>

      <section>
        <Search onLoadIngredients={filteredIngredientsHandler}/>
        <IngredientList ingredients={userIngredients} onRemoveItem={() => {}}/>
      </section>
    </div>
  );
}

export default Ingredients;
