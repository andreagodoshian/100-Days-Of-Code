import React, { useState, useEffect, useRef } from "react";
import './App.css';

export default function App() {
  const [name, setName] = useState("");

  const renderCount = useRef(1); // returns { current: 0 }
  useEffect(() => { renderCount.current = renderCount.current + 1; })

  const inputRef = useRef("");
  function focus() {
    console.log(inputRef.current);
    inputRef.current.focus();
  }

  const previousName = useRef();
  useEffect(() => {
    previousName.current = name
  }, [name])

  return (
    <>
    <input ref={inputRef} value={name} onChange={e => setName(e.target.value)}/>
    <div>Hey, my name is {name}, but it used to be {previousName.current}</div>
    <div>I rendered {renderCount.current} time(s).</div>
    <button onClick={focus}>Focus</button>
    </>
  );
}