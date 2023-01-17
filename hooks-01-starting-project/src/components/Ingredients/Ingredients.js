import React, {useState, useEffect, useCallback} from 'react';

import IngredientForm from './IngredientForm';
import IngredientList from "./IngredientList";
import Search from './Search';

function Ingredients() {
  const [userIngredients, setUserIngredients] = useState([]);

  useEffect(() => {
    console.log("RENDERING INGREDIENTS", userIngredients);
  }, [userIngredients]);

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

    // DELETE request
    const removeIngredientHandler = ingredientId => {
      fetch(`https://intro-to-reactjs-default-rtdb.firebaseio.com/ingredients/${ingredientId}.json`, {
        method: "DELETE"
      }).then(response => {
        setUserIngredients(prevIngredients =>
          prevIngredients.filter(ingredient => ingredient.id !== ingredientId))       
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
        <Search onLoadIngredients={filteredIngredientsHandler} />
        <IngredientList
          ingredients={userIngredients}
          onRemoveItem={removeIngredientHandler}
        />
      </section>
    </div>
  );
}

export default Ingredients;
