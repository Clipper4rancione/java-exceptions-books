package org.lessons.java;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String publisher;

    // CONSTRUCTOR
    public Book(String title, int pages, String author, String publisher) {
        String exceptionMessage = "";
        if (checkExceptionString(title)){
            exceptionMessage += "Il titolo non può essere vuoto";
        }
        if (checkExceptionString(author)){
            exceptionMessage += "L'autore non può essere vuoto";
        }
        if (checkExceptionString(publisher)){
            exceptionMessage += "l'editore non può essere vuoto";
        }
        if (pages <= 0){
            exceptionMessage += "le pagine devono essere superiori a 0";
        }
        if (exceptionMessage.length() > 0){
            exceptionMessage = exceptionMessage.substring(0, exceptionMessage.length() - 1);
            throw new IllegalArgumentException(exceptionMessage);
        }
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
        if (checkExceptionString(title)){
            throw new IllegalArgumentException("Il titolo non può essere vuoto");
        }
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0){
            throw new IllegalArgumentException("le pagine devono essere superiori a 0");
        }
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (checkExceptionString(author)){
            throw new IllegalArgumentException("L'autore non può essere vuoto");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (checkExceptionString(publisher)){
            throw new IllegalArgumentException("L'editore non può essere vuoto");
        }
        this.publisher = publisher;
    }

    // METHODS

    private boolean checkExceptionString(String str){
         return str == null || str.trim().isEmpty();
    }
//    private void checkExceptionInt(int n, String name) throws IllegalArgumentException{
//        if (n <= 0){
//            throw new IllegalArgumentException("Il campo " + name + " deve contenere almeno 1 numero");
//        }
//    }

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
