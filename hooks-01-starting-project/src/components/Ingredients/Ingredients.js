import React, { useEffect, useCallback, useReducer} from 'react';

import IngredientForm from './IngredientForm';
import IngredientList from "./IngredientList";
import Search from './Search';
import ErrorModal from "../UI/ErrorModal";

//////////////////////////////////

const ingredientReducer = (currentIngredients, action) => {
  switch (action.type) {
    case "SET":
      return action.ingredients;
    case "ADD":
      return [...currentIngredients, action.ingredient];
    case "DELETE":
      return currentIngredients.filter(x => x.id !== action.id)
    default:
      throw new Error("Should not get here!");
  }
}

const httpReducer = (currentHttpState, action) => {
  switch (action.type) {
    case "SEND":
      return {loading: true, error: null};
    case "RESPONSE":
      return {...currentHttpState, loading: false}
    case "ERROR":
      return {loading: false, error: action.errorData};
    case "CLEAR":
      return {...currentHttpState, error: null}
    default:
      throw new Error("Should not get here!");
  }
}

///////////////////////////////////////

function Ingredients() {
  const [userIngredients, dispatch] = useReducer(ingredientReducer, []);
  const [httpState, dispatchHttp] = useReducer(httpReducer, {loading: false, error: null});

  useEffect(() => {
    console.log("RENDERING INGREDIENTS", userIngredients);
  }, [userIngredients]);

  // POST request
  const addIngredientHandler = useCallback(ingredient => {
    dispatchHttp({type: "SEND"})
    fetch("https://intro-to-reactjs-default-rtdb.firebaseio.com/ingredients.json", {
      method: "POST",
      body: JSON.stringify(ingredient),
      headers: {"Content-Type": "application/json"}
    }).then(response => {
      dispatchHttp({type: "RESPONSE"})
      return response.json()
    }).then(responseData => {
      dispatch({type: "ADD", ingredient: {id: responseData.name, ...ingredient}})
      })
  }, []) // no external, but [] 
  // "callback hell" -JJQuery

    // DELETE request
    const removeIngredientHandler = useCallback(ingredientId => {
      dispatchHttp({type: "SEND"})
      fetch(`https://intro-to-reactjs-default-rtdb.firebaseio.com/ingredients/${ingredientId}.json`, {
        method: "DELETE"
      }).then(response => {
        dispatchHttp({type: "RESPONSE"})
        dispatch({type: "DELETE", id: ingredientId})      
      }).catch(e => {
        dispatchHttp({type: "ERROR", errorData: e.message})
      })
    }, []);

  // SEARCH
  const filteredIngredientsHandler = useCallback(filteredIngredients => {
    dispatch({type: "SET", ingredients: filteredIngredients})
  }, []);

  // ERROR RESET
  const clearError = useCallback(() => {
    dispatchHttp({type: "CLEAR"})
  }, []);

  return (
    <div className="App">
      {httpState.error && <ErrorModal onClose={clearError}>{httpState.error}</ErrorModal>}
      <IngredientForm onAddIngredient={addIngredientHandler} loading={httpState.loading}/>

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
