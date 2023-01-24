import React, { useState } from "react";

import Card from "../UI/Card";
import Button from "../UI/Button";
import ErrorModal from "../UI/ErrorModal";
import classes from "./AddUser.module.css";

const AddUser = (props) => {
  const [enteredUsername, setEnteredUsername] = useState("");
  const [enteredAge, setEnteredAge] = useState("");
  const [error, setError] = useState();

  const addUserHandler = (e) => {
    e.preventDefault();
    if (
      enteredUsername.trim().length === 0 ||
      enteredAge.trim().length === 0
    ) { 
      setError({
        title: "Invalid Input!",
        message: "Input shouldn't be empty/null."
      })
      return; 
    }
    if (+enteredAge < 1) { 
      setError({
        title: "Invalid Age!",
        message: "Age should be greater than zero."
      })
      return; 
    }
    props.onAddUser(enteredUsername, enteredAge);
    setEnteredUsername("");
    setEnteredAge("");
  };

  const usernameOnChange = (e) => {
    setEnteredUsername(e.target.value);
  };

  const ageOnChange = (e) => {
    setEnteredAge(e.target.value);
  };

  const errorHandler = () => {
    setError(null);
  }

  return (
    <div>
      {error && <ErrorModal 
      title={error.title} 
      message={error.message}
      onConfirm={errorHandler} />}

      <Card className={classes.input}>
        <form onSubmit={addUserHandler}>
          {/* button at the bottom is "type submit" */}

          <label htmlFor="username">Username:</label>
          {/* "class" is not available in jsx,
        so use "htmlFor" (screen-readers)*/}
          <input
            type="text"
            id="username"
            value={enteredUsername}
            onChange={usernameOnChange}
          />

          <label htmlFor="age">Age:</label>
          <input
            type="number"
            id="age"
            value={enteredAge}
            onChange={ageOnChange}
          />

          <Button type="submit">Add User</Button>
        </form>
      </Card>
    </div>
  );
};

export default AddUser;
