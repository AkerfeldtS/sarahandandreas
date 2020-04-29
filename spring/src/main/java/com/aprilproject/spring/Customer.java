package com.aprilproject.spring;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.lang.Override;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@Document(collection = "customer3")
public class Customer {

    @Id
    public String id;  
    public String firstName;
    public String lastName;
    private String illegalCharacters = "[=~#@*+%{}<>\\[\\]|\"\\_^]"; 

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        if(firstName.length() == 0){
            return;
        } else if(containsIllegals(firstName)){
            return;
        } else if (Character.isDigit(firstName.charAt(0))) {
            return;
        } else {
            this.firstName = firstName;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%s, firstname='%s', lastname='%s']",
            id, firstName, lastName);
    }

    private boolean containsIllegals(String toExamine) {
        Pattern pattern = Pattern.compile(illegalCharacters);
        Matcher matcher = pattern.matcher(toExamine);
        return matcher.find();
    }

    
}