package com.loose.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails(){
        return "User detail from database";
    }
}
