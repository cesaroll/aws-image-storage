import React, { useEffect } from "react";
import "./App.css";
import axios from "axios";
import { fetchUserProfiles } from "./UserProfiles/services/UserProfileService";

const UserProfiles = (): JSX.Element => {
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
