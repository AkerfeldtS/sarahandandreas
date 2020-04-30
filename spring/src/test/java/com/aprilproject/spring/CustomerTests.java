package com.aprilproject.spring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CustomerTests {

    //Unit tests to verify Customer firstname inputs
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
    void verifyFirstNameMaximumLengthIsValid(){
        Customer customer = new Customer();
        customer.setFirstName("PippilottaViktualiaRullgardinaKrusmyntaEfraimsdotter");
        assertNull(customer.getFirstName());
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

    //Unit tests to verify Customer lastname inputs
    @Test
    void verifyLastNameIsNotSet() {
        Customer customer = new Customer();
        assertNull(customer.getLastName());
    } 

    @Test
    void verifyLastNameIsNotEmpty(){
        Customer customer = new Customer();
        customer.setLastName("");
        assertNull(customer.getLastName());
    }

    @Test
    void verifyLastNameIsValid(){
        Customer customer = new Customer();
        customer.setLastName("b");
        assertEquals("b", customer.getLastName(), "Lastname is not valid.");

        customer.setLastName("von Anka");
        assertEquals("von Anka", customer.getLastName(), "Lastname is not valid.");

        customer.setLastName("Abcdefghijklmnopqrstuvwxyzåäö");
        assertEquals("Abcdefghijklmnopqrstuvwxyzåäö", customer.getLastName(), "Lastname is not valid.");

        customer.setLastName("Berg-Skogslund");
        assertEquals("Berg-Skogslund", customer.getLastName(), "Lastname is not valid.");

        customer.setLastName("of Great Britannia");
        assertEquals("of Great Britannia", customer.getLastName(), "Lastname is not valid.");
    }

    @Test
    void verifyLastNameMaximumLengthIsValid(){
        Customer customer = new Customer();
        customer.setLastName("KarlssonKarlssonVärldensBästaKarlsson                        ");
        assertNull(customer.getLastName());
    }

    @Test
    void verifyLastNameDoesNotContainIllegalCharacters(){
        Customer customer = new Customer();
        customer.setLastName("=Karlsson");
        assertNull(customer.getLastName());

        customer.setLastName("Andersson&");
        assertNull(customer.getLastName());

        customer.setLastName("\\#");
        assertNull(customer.getLastName());
    }

    @Test
    void verifyLastNameContainsLegalFirstLetter(){
        Customer customer = new Customer();
        customer.setLastName("5Fab");
        assertNull(customer.getLastName());

        customer.setLastName(" 7Klasberg");
        assertNull(customer.getLastName());
    }

    @Test
    void verifyLastNameHasNoLeadingOrTrailingSpaces(){
        Customer customer = new Customer();

        customer.setLastName(" ");
        assertNull(customer.getLastName());

        customer.setLastName(" von Anka ");
        assertEquals("von Anka", customer.getLastName(), "Lastname is not valid.");
    }

    @Test
    void verifyLastNameIgnoresIllegalNameChange(){
        Customer customer = new Customer();
        customer.setLastName("Johansson");
        assertEquals("Johansson", customer.getLastName(), "Lastname is not valid.");
        customer.setLastName(" "); // Change to illegal name shall keep previous name
        assertEquals("Johansson", customer.getLastName(), "Lastname is not valid.");
    }

}