package org.lessons.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanti libri vorresti aggiungere? ");
        int n = Integer.parseInt(scanner.nextLine());
        Book[] bookList = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il titolo del libro: ");
            String title = scanner.nextLine();
            System.out.print("Inserisci il numero di pagine: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Inserisci l'autore del libro: ");
            String author = scanner.nextLine();
            System.out.print("Inserisci l'editore del libro: ");
            String publisher = scanner.nextLine();

            try {
                Book book = new Book(title, pages, author, publisher);
                bookList[i] = book;
                System.out.println("Il tuo libro" + book.getTitle() + "è stato correttamente aggiunto al catalogo");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
