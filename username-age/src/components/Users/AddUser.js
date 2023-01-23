import React, { useState } from "react";

import Card from "../UI/Card";
import Button from "../UI/Button";
import classes from "./AddUser.module.css";

const AddUser = (props) => {
  const [enteredUsername, setEnteredUsername] = useState("");
  const [enteredAge, setEnteredAge] = useState("");

  const addUserHandler = (e) => {
    e.preventDefault();
    if (enteredUsername.trim().length === 0 
    || enteredAge.trim().length === 0
    || +enteredAge < 1) {
        return;
    }
    // console.log(enteredUsername, enteredAge)
    props.onAddUser(enteredUsername, enteredAge)
    setEnteredUsername("")
    setEnteredAge("")
  };

  const usernameOnChange = (e) => {
    setEnteredUsername(e.target.value)
  }

  const ageOnChange = (e) => {
    setEnteredAge(e.target.value)
  }

  return (
    <Card className={classes.input}>
      <form onSubmit={addUserHandler}>
        {/* button at the bottom is "type submit" */}

        <label htmlFor="username">Username:</label>
        {/* "class" is not available in jsx,
        so use "htmlFor" (screen-readers)*/}
        <input type="text" 
        id="username" 
        value={enteredUsername}
        onChange={usernameOnChange}/>

        <label htmlFor="age">Age:</label>
        <input type="number" 
        id="age" 
        value={enteredAge}
        onChange={ageOnChange}/>

        <Button type="submit">Add User</Button>
      </form>
    </Card>
  );
};

export default AddUser;
