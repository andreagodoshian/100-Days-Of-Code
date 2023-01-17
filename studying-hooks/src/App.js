import React, { useState } from "react";
import './App.css';

function complexFunction() {
  console.log("In theory, you can go wild here.")
  return Math.PI
}

export default function App() {

  const [simpleState, setSimpleState] = useState(4);

  function decrementCount() {
    setSimpleState(countState => countState - 1)
  } // setState is a function w/ Lambda param

  function incrementCount() {
    setSimpleState(countState => countState + 1)
  }

  //////////////////////////////////

  const [piState, setPiState] = useState(() => complexFunction()); 
  function decrementPi() {setPiState(x => x - 1)}
  function incrementPi() {setPiState(x => x + 1)}

  return (
    <>
    <h1>Basic Decrement/Increment</h1>
    <button onClick={decrementCount}>-</button>
    <span> {simpleState} </span>
    <button onClick={incrementCount}>+</button>
    <br/>
    <h1>Pi Decrement/Increment</h1>
    <button onClick={decrementPi}>-</button>
    <span> {piState} </span>
    <button onClick={incrementPi}>+</button>
    </>
  );

}