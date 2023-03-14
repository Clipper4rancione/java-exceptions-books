package org.lessons.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String FILE_PATH = "./books.txt";
        System.out.print("Quanti libri vorresti aggiungere? ");
        int n = Integer.parseInt(scanner.nextLine());
        Book[] bookList = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il titolo del " + (i + 1) +  " libro: ");
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
                System.out.println("Il tuo libro " + book.getTitle() + " è stato correttamente aggiunto al catalogo");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
            scanner.close();
            System.out.println("Ecco il tuo catalogo dei libri:");
            System.out.println("*******************");
            System.out.println(Arrays.toString(bookList));
            System.out.println("*******************");

            // FILE WRITER

            FileWriter writer = null;
            try{
                writer = new FileWriter(FILE_PATH, true);
                for (Book currentBook : bookList){
                    writer.write(currentBook.toString() + "/n");
                }
            } catch (IOException e){
                System.out.println("Non è stato possibile creare il file");
                System.out.println(e.getMessage());
            } finally {
                if (writer != null){
                    try{
                        writer.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
    }
}
