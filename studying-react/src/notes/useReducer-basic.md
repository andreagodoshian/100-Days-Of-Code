import React, { useReducer } from "react";
import './App.css';

const ACTIONS = {
  INCREMENT: "increment",
  DECREMENT: "decrement"
}

function reducerFunction(currentState, action) {
  switch (action.type) {
    case ACTIONS.INCREMENT:
      return {count: currentState.count + 1};
    case ACTIONS.DECREMENT:
      return {count: currentState.count - 1};
    default:
      // return "Error! Sorry!";
      return currentState;
  }
}

export default function App() {
  const [state, dispatch] = useReducer(reducerFunction, {count: 0});
  // state.count

  function decrementCount() {
    dispatch({type: ACTIONS.DECREMENT});
  }

  function incrementCount() {
    dispatch({type: ACTIONS.INCREMENT});
  }

  //////////////////////////////////

  return (
    <>
    <h1>Basic Decrement/Increment</h1>
    <button onClick={decrementCount}>-</button>
    <span> {state.count} </span>
    <button onClick={incrementCount}>+</button>
    </>
  );

}