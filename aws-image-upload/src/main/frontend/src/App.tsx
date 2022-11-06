import React, { useEffect, useState } from "react";
import "./App.css";
import UserProfiles from "./UserProfiles/components/UserProfiles";
import { UserProfilesContext } from "./UserProfiles/context/UserProfileContext";
import { fetchUserProfiles } from "./UserProfiles/services/UserProfileService";
import { UserProfileInterface } from "./UserProfiles/types/UserProfileInterface";

const App = () => {
  const [userProfiles, setUserProfiles] = useState<UserProfileInterface[]>([]);

  useEffect(() => {
    fetchUserProfiles(setUserProfiles);
  }, []);

  return (
    <div className="App">
      <UserProfilesContext.Provider value={{ userProfiles }}>
        <UserProfiles></UserProfiles>
      </UserProfilesContext.Provider>
    </div>
  );
};

export default App;
