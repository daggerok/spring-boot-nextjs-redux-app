import { createStore } from 'redux';
import { actions } from './actions';

const reducer = (state = { counter: 0 }, action) => {
  if (action.type === actions.FETCH_ACTION) return { counter: state.counter + 1};
  return state;
};

export const store = createStore(reducer);
