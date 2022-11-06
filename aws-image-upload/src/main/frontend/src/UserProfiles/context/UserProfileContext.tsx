import React, { createContext } from "react";
import { UserProfileContextType } from "../types/UserProfileContextType";

export const UserProfilesContext = createContext<UserProfileContextType | null>(
  null
);
