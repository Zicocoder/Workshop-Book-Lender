package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        // Create a book instance
        Book dune = new Book("Dune", "Frank Herbert");

        // Display book information
        System.out.println(dune.getBookInformation());

        // Create a person instance
        Person p = new Person("Erik", "Svensson");

        // Display person information
        System.out.println(p.getPersonInformation());

        // Loan a book to the person
        p.loanBook(dune);

        // Display person information after borrowing a book
        System.out.println(p.getPersonInformation());

        // Display book information after borrowing a book
        System.out.println(dune.getBookInformation());

        // Return the borrowed book
        p.returnBook(dune);

        // Display person information after returning the book
        System.out.println(p.getPersonInformation());

        // Display book information after returning the book
        System.out.println(dune.getBookInformation());
    }
}
