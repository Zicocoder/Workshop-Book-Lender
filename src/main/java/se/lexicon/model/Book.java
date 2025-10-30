package se.lexicon.model;


import java.util.UUID;

public class Book {
    private final String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        setAvailable(true);
        id = UUID.randomUUID().toString();
    }
    public Book(Person borrower, String author, String title) {
        this(title, author);
        setBorrower(borrower);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    private void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        setAvailable(false);
    }

    public String getId() {
        return id;
    }


}

