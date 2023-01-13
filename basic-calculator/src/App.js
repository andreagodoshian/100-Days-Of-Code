// r-r-r-REMIX! Guess it's time for React.js
// Thank you: https://www.youtube.com/watch?v=DgRrrOt0Vr8&t=9s
// "I have three production outages named after me... four."

import { useReducer } from "react";
import "./styles.css";

// function reducer(state, action) {}
function reducer(state, action) {

}

function App() {
  // const [state, dispatch] = useReducer(reducer, {})
  const [ {currentOperand, previousOperand, operation}, dispatch ] = useReducer(reducer, {})
  return (
    <div className="calculator-grid">
      <div className="output">
        <div className="previous-operand">{previousOperand} {operation}</div>
        <div className="current-operand">{currentOperand}</div>
      </div>
      <button className="span-two">AC</button>
      <button>DEL</button>
      <button>÷</button>
      <button>1</button>
      <button>2</button>
      <button>3</button>
      <button>×</button>
      <button>4</button>
      <button>5</button>
      <button>6</button>
      <button>+</button>
      <button>7</button>
      <button>8</button>
      <button>9</button>
      <button>-</button>
      <button>.</button>
      <button>0</button>
      <button className="span-two">=</button>
    </div>
  )
}

export default App;
