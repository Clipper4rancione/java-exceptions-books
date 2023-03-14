package org.lessons.java;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String publisher;

    // CONSTRUCTOR
    public Book(String title, int pages, String author, String publisher) {
        checkException();
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }

    // GETTERS AND SETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // METHODS

    public void checkException(){
        if (title == null){
            throw new IllegalArgumentException("Il campo titolo non può essere vuoto");
        }
        if (pages <= 0){
            throw new IllegalArgumentException("Il numero di pagine deve essere superiore a 0");
        }
        if (author == null){
            throw new IllegalArgumentException("Il campo autore non può essere vuoto");
        }
        if (publisher == null){
            throw new IllegalArgumentException("Il campo dell'editore non può essere vuoto");
        }
    }
}
