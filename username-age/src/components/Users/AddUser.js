import React from "react";

import Card from '../UI/Card';
import classes from "./AddUser.module.css"

const AddUser = () => {
  const addUserHandler = (e) => {
    e.preventDefault();
  };

  return (
    <Card className={classes.input}>
      <form onSubmit={addUserHandler}>
        {/* button at the bottom is "type submit" */}
        <label htmlFor="username">Username:</label>
        {/* "class" is not available in jsx,
        so we would use htmlFor (screen-readers)*/}
        <input type="text" id="username" />
        <label htmlFor="age">Age:</label>
        <input type="number" id="age" />
        <button type="submit">Add User</button>
      </form>
    </Card>
  );
};

export default AddUser;
