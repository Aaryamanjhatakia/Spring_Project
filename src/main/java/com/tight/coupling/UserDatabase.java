package com.tight.coupling;

//Database A - MySQL, PostgreSQL
//Database B - WebService, MongoDB


public class UserDatabase {
    public String getUserDetails(){
        // Directly access database from here
        return "User Details from Database";
    }
}
