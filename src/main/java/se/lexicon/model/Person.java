package se.lexicon.model;

import java.util.Arrays;


public class Person {

    private static int sequencer;
    private int id;
    private String firstName;
    private String lastName;
    private Book[] borrowed = new Book[0];


    private static int getNextID() {
        return sequencer++;
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

    public Book[] getBorrowed() {
        return borrowed;
    }

    private void setBorrowed(Book[] borrowed) {
        this.borrowed = borrowed;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setBorrower(this);
            Book[] newBorrowed = Arrays.copyOf(borrowed, borrowed.length + 1);
            newBorrowed[newBorrowed.length - 1] = book;
            setBorrowed(newBorrowed);
        } else {
            throw new RuntimeException("The book is not available");

        }

    }

    public void returnBook(Book book) {

        Book[] newBorrowed = new Book[borrowed.length];
        for (int i = 0, j = 0; i < borrowed.length; i++) {

            if (!borrowed[i].getId().equals(book.getId())) {
                newBorrowed[j] = borrowed[i];
                j++;

            }
        }

        if (newBorrowed.length < borrowed.length) {
            book.setBorrower(null);
            borrowed = newBorrowed;
        } else {
            throw new RuntimeException("Book was not borrowed");
        }
    }

    public String getPersonInformation() {
        return String.format("First name: %s, last name: %s borrowed books: %s",
                getFirstName(), getLastName(), Arrays.toString(borrowed));

    }


// todo: needs completion UUID.
}