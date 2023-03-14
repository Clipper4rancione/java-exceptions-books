package org.lessons.java;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String publisher;

    // CONSTRUCTOR
    public Book(String title, int pages, String author, String publisher) {
        checkExceptionString(title, "titolo");
        checkExceptionInt(pages, "pagine");
        checkExceptionString(author, "autore");
        checkExceptionString(publisher, "editore");
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
        checkExceptionString(title, "titolo");
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        checkExceptionInt(pages, "pagine");
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        checkExceptionString(author, "autore");
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        checkExceptionString(publisher, "editore");
        this.publisher = publisher;
    }

    // METHODS

    private void checkExceptionString(String str, String name) throws IllegalArgumentException{
        if ( str.length() == 1){
            throw new IllegalArgumentException("Il campo" + name + "deve contenere almeno 1 carattere");
        }
    }
    private void checkExceptionInt(int n, String name) throws IllegalArgumentException{
        if (n <= 0){
            throw new IllegalArgumentException("Il campo" + name + "deve contenere almeno 1 numero");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
