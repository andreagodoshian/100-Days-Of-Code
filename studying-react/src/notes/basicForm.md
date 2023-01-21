## I KNOW THIS IS EXTREMELY BASIC ##

import React, { useState } from "react";
import "./App.css";

export default function App() {
  const [contactInfo, setContactInfo] = useState({
    name: "",
    email: "",
    phonenumber: ""
  })

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(`OFFICIAL LOG:  ${contactInfo.name}, ${contactInfo.email}, ${contactInfo.phonenumber}`);
    alert(`Thank you for your submission ${contactInfo.name} :)`)
    setContactInfo({
      name: "", email: "", phonenumber: ""
    })
  }

  const handleChange = (e) => {
    setContactInfo({...contactInfo, [e.target.name]: e.target.value})
  }

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label>
          Name:
          <input
            type="text"
            name="name"
            placeholder="Name"
            value={contactInfo.name}
            onChange={handleChange}
          />
        </label>
      </div>
      <div>
        <label>
          Email:
          <input
            type="email"
            name="email"
            placeholder="E-mail"
            value={contactInfo.email}
            onChange={handleChange}
          />
        </label>
      </div>
      <div>
        <label>
          Phone:
          <input
            type="text"
            name="phonenumber"
            placeholder="Phone Number"
            value={contactInfo.phonenumber}
            onChange={handleChange}
          />
        </label>
      </div>
      {/*<input type="submit" value="Submit" />*/}
      <button>Submit Contact</button>
    </form>
  );
}