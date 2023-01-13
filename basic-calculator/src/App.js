import { useState } from "react";
import "./App.css";
import Button from "./components/Button.js";
import Input from "./components/Input.js";

const App = () => {
  return (
    <div className="App">
      <div className="calc-wrapper">
        <Input/>
        <div className="row">
          <Button symbol="7"></Button>
          <Button symbol="8"></Button>
          <Button symbol="9"></Button>
          <Button symbol="/"></Button>
        </div>
        <div className="row">
          <Button symbol="4"></Button>
          <Button symbol="5"></Button>
          <Button symbol="6"></Button>
          <Button symbol="*"></Button>
        </div>
        <div className="row">
          <Button symbol="1"></Button>
          <Button symbol="2"></Button>
          <Button symbol="3"></Button>
          <Button symbol="+"></Button>
        </div>
        <div className="row">
          <Button symbol="0"></Button>
          <Button symbol="."></Button>
          <Button symbol="="></Button>
          <Button symbol="-"></Button>
        </div>
      </div>
    </div>
  )
}

export default App;