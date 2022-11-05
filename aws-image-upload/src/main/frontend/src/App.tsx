import React, { useEffect, useState } from "react";
import "./App.css";
import UserProfiles from "./UserProfiles/components/UserProfiles";
import { getUserProfiles } from "./UserProfiles/services/UserProfileService";
import { UserProfileInterface } from "./UserProfiles/types/UserProfileInterface";

function App() {
  const [userProfiles, setUserProfiles] = useState<UserProfileInterface[]>([]);

  const fetchUserProfiles = async () => {
    const items = await getUserProfiles();
    setUserProfiles(items);
  };

  useEffect(() => {
    fetchUserProfiles();
  }, []);

  return (
    <div className="App">
      <UserProfiles userProfiles={userProfiles}></UserProfiles>
    </div>
  );
}

export default App;
