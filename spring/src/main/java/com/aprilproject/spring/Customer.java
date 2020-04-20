package com.aprilproject.spring;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.lang.Override;

@Document(collection = "customer2")
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

    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%s, firstname='%s']",
            id, firstName);
    }
}