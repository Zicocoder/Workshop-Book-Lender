package se.lexicon.model;

import java.rmi.server.UID;
import java.util.UUID;


public class Person {

    private static int sequencer;
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books = new Book[0];



    public String getPersonInformation(){
        return "";
    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        id = Person.getNextID();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    private static int getNextID() {
    return sequencer++;
    }
// todo: needs completion UUID.
}