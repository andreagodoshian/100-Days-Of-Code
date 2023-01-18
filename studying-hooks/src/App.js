import React, { useReducer, useState } from "react";
import Todo from "./Todo";
import './App.css';

export const ACTIONS = {
  ADD_TODO: "add-todo",
  TOGGLE_TODO: "toggle-todo",
  DELETE_TODO: "delete-todo"
}

function reducerFunction(currentState, action) {
  switch (action.type) {
    case ACTIONS.ADD_TODO:
      return [...currentState, newTodo(action.payload.name)]
    case ACTIONS.TOGGLE_TODO:
      return currentState.map(x => {
        if (x.id === action.payload.id) {
          return { ...x, complete: !x.complete}
        }
        else {
          return x;
        }
      })
    case ACTIONS.DELETE_TODO:
      return currentState.filter(x => x.id !== action.payload.id);
    default:
      return currentState;

  }
}

function newTodo(name) {
  return {id: Date.now(), name: name, complete: false}
}

export default function App() {
  const [todos, dispatch] = useReducer(reducerFunction, []);
  const [name, setName] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    dispatch({type: ACTIONS.ADD_TODO, payload: {name: name}})
    setName("")
  }

  return (
    <>
    <h1>useReducer() is tough</h1>
    <form onSubmit={handleSubmit}>
      <input type="text" 
      value={name} 
      onChange={e => setName(e.target.value)}/>
    </form>

    {todos.map(x => {
      return <Todo key={x.id} todo={x} dispatch={dispatch}/>;
    })}
    </>
  );

}