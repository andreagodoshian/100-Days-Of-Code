import { useState } from "react";
import "./App.css";
import Button from "./components/Button.js";

const App = () => {
  return (
    <div className="App">
      <div className="calc-wrapper">
        <div className="row">
          <Button></Button>
          <Button></Button>
          <Button></Button>
          <Button></Button>
        </div>
        <div className="row">
          <Button></Button>
          <Button></Button>
          <Button></Button>
          <Button></Button>
        </div>
        <div className="row">
          <Button></Button>
          <Button></Button>
          <Button></Button>
          <Button></Button>
        </div>
        <div className="row">
          <Button></Button>
          <Button></Button>
          <Button></Button>
          <Button></Button>
        </div>
      </div>
    </div>
  )
}

export default App;