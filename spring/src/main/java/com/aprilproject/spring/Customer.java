package com.aprilproject.spring;

import org.springframework.data.annotation.Id;

import java.lang.Override;

public class Customer {

    @Id
    public String id;

    public String firstName;

    public Customer() {}

    public Customer(String firstName) {
        this.firstName = firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%s, firstname='%s']",
            id, firstName);
    }
}