import { useDispatch, useSelector } from 'react-redux';
import classes from './Counter.module.css';

/*
1.) useSelector
2.) dispatch = useDispatch() 
3.) create handlers!! inside = dispatch({ ... })
^^dispatches "actions" [object w/ type prop]
4.) wire-up your handlers (ex. button onClick)
^^since it's dispatching, you're all set
*/

const Counter = () => {
  const dispatch = useDispatch();

  const counter = useSelector(state => state.counter);
  const canSeeCounter = useSelector(state => state.showCounter);

  const incHandler = () => {dispatch({type: "increment"})}
  const plusFive = () => {dispatch({type: "plusFive", amt: 5})};
  const decHandler = () => {dispatch({type: "decrement"})}
  const toggleCounterHandler = () => {dispatch({type: "toggle"})};

  return (
    <main className={classes.counter}>
      <h1>Redux Counter</h1>
      {canSeeCounter && <div className={classes.value}>{counter}</div>}
      <div>
        <button onClick={incHandler}>Increment</button>
        <button onClick={plusFive}>Increment By Five</button>
        <button onClick={decHandler}>Decrement</button>
      </div>
      <button onClick={toggleCounterHandler}>Toggle Counter</button>
    </main>
  );
};

export default Counter;