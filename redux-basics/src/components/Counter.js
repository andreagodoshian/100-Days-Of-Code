import { useDispatch, useSelector } from 'react-redux';
import { counterActions } from '../store/counter';
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
  const counter = useSelector((state) => state.counter.counter);
  const show = useSelector((state) => state.counter.showCounter);

  const incrementHandler = () => {dispatch(counterActions.increment())};
  const increaseHandler = () => {dispatch(counterActions.increase(10))};
  const decrementHandler = () => {dispatch(counterActions.decrement())};
  const toggleCounterHandler = () => {dispatch(counterActions.toggleCounter())};

  return (
    <main className={classes.counter}>
      <h1>Redux Counter</h1>
      {show && <div className={classes.value}>{counter}</div>}
      <div>
        <button onClick={incrementHandler}>Increment</button>
        <button onClick={increaseHandler}>Increase by 10</button>
        <button onClick={decrementHandler}>Decrement</button>
      </div>
      <button onClick={toggleCounterHandler}>Toggle Counter</button>
    </main>
  );
};

export default Counter;