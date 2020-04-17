package com.aprilproject.spring;

import org.springframework.data.annotation.Id;
import java.lang.Override;


public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%s, firstname='%s', lastname='%s']",
            id, firstName, lastName);
    }
}