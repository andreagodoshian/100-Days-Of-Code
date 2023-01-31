// only have one store, so only need to provide once
// **see index.js - the highest level**
import { createStore } from 'redux';

const initialState = { counter: 0, showCounter: true }
// squishing everything into the one reducer, eh??

const counterReducer = (state = initialState, action) => {
  if (action.type === 'increment') {
    return {
      counter: state.counter + 1,
      showCounter: state.showCounter // <--- overwriting, so must define
    };
  }

  if (action.type === "plusFive") {
    return {
      counter: state.counter + 5,
      showCounter: state.showCounter
    }
  }

  if (action.type === 'decrement') {
    return {
      counter: state.counter - 1,
      showCounter: state.showCounter
    };
  }

  if (action.type === "toggle") {
    return {
      counter: state.counter,
      showCounter: !state.showCounter
    }
  }

  return state;
};

const store = createStore(counterReducer);
//^^the store eats reducers!!

export default store;