package com.learniing.learning;

public class User {
    
    private String name;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "here is all the value " + this.name + " " + this.email + " " + this.password;
    }

}
