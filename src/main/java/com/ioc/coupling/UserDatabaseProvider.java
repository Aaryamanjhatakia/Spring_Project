package com.ioc.coupling;

//Database A - MySQL, PostgreSQL
//Database B - WebService, MongoDB


public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        // Directly access database from here
        return "User Details from Database";
    }
}
