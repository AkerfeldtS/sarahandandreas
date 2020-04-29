package com.aprilproject.spring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CustomerTests {

    @Test
    void verifyFirstNameIsNotSet() {
        Customer customer = new Customer();
        assertNull(customer.getFirstName());
    } 

    @Test
    void verifyFirstNameIsNotEmpty(){
        Customer customer = new Customer();
        customer.setFirstName("");
        assertNull(customer.getFirstName());
    }

    @Test
    void verifyFirstNameIsValid(){
        Customer customer = new Customer();
        customer.setFirstName("a");
        assertEquals("a", customer.getFirstName(), "Firstname is not valid.");

        customer.setFirstName("Kalle Anka");
        assertEquals("Kalle Anka", customer.getFirstName(), "Firstname is not valid.");

        customer.setFirstName("Abcdefghijklmnopqrstuvwxyzåäö");
        assertEquals("Abcdefghijklmnopqrstuvwxyzåäö", customer.getFirstName(), "Firstname is not valid.");

        customer.setFirstName("Hanna-Klara");
        assertEquals("Hanna-Klara", customer.getFirstName(), "Firstname is not valid.");

        customer.setFirstName("Charles the 2nd");
        assertEquals("Charles the 2nd", customer.getFirstName(), "Firstname is not valid.");
    }

    @Test
    void verifyFirstNameDoesNotContainIllegalCharacters(){
        Customer customer = new Customer();
        customer.setFirstName("=Stina");
        assertNull(customer.getFirstName());

        customer.setFirstName("Stin@");
        assertNull(customer.getFirstName());

        customer.setFirstName("\\#");
        assertNull(customer.getFirstName());
    }

    @Test
    void verifyFirstNameContainsLegalFirstLetter(){
        Customer customer = new Customer();
        customer.setFirstName("9Anna");
        assertNull(customer.getFirstName());

        customer.setFirstName(" 7Klas");
        assertNull(customer.getFirstName());
    }

    @Test
    void verifyFirstNameHasNoLeadingOrTrailingSpaces(){
        Customer customer = new Customer();

        customer.setFirstName(" ");
        assertNull(customer.getFirstName());

        customer.setFirstName(" Sven Anders ");
        assertEquals("Sven Anders", customer.getFirstName(), "Firstname is not valid.");
    }

    @Test
    void verifyFirstNameIgnoresIllegalNameChange(){
        Customer customer = new Customer();
        customer.setFirstName("Svante");
        assertEquals("Svante", customer.getFirstName(), "Firstname is not valid.");
        customer.setFirstName(" "); // Change to illegal name shall keep previous name
        assertEquals("Svante", customer.getFirstName(), "Firstname is not valid.");
    }

}