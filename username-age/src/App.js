import React, {useState} from 'react';

import AddUser from "./components/Users/AddUser";
import UsersList from './components/Users/UsersList';

/*
The tricky thing is getting the data from AddUser...
don't panic. Just send a function. Get it?
Since you're sending it, it technically lives here.
*/

function App() {
  const [usersList, setUsersList] = useState([]);

  const addUserHandler = (uName, uAge) => {
    setUsersList(x => {
      return [...x, {name: uName, age: uAge, id: Math.random().toString()}]
    })
  }

  return (
    <div>
      <AddUser onAddUser={addUserHandler}/>
      <UsersList users={usersList}/>
    </div>
  );
}

export default App;