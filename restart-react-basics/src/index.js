// **remember: this is the first to execute
////////////////////////////////////////////

import ReactDOM from 'react-dom/client';
import App from './App';
import './index.css';
// ^^css import doesn't work in vanilla javascript

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App />);
// ^^this html also doesn't work in vanilla javascript