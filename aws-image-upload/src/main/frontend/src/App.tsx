import React, { useEffect } from "react";
import "./App.css";
import axios from "axios";

const UserProfiles = (): JSX.Element => {
  const fetchUserProfiles = () => {
    axios.get("http://localhost:8080/api/v1/user-profile").then((res) => {
      console.log(res);
    });
  };

  useEffect(() => {
    console.log("Call fetchUserProfiles");
    fetchUserProfiles();
  }, []);

  return <h1>Hello</h1>;
};

function App() {
  return (
    <div className="App">
      <UserProfiles></UserProfiles>
    </div>
  );
}

export default App;
