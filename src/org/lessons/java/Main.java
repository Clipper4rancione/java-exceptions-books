package org.lessons.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanti libri vorresti aggiungere? ");
        int n = Integer.parseInt(scanner.nextLine());
        Book[] bookList = new Book[n];

        for (int i = 0; i < n; i++) {
            String title = "";
            do {
                System.out.print("Inserisci il titolo del " + (i + 1) +  " libro: ");
                title = scanner.nextLine();
                if (title.length() == 0){
                    System.out.println("Il titolo non può essere vuoto");
                }
            } while (title.length() == 0);
            int pages = 0;
            do {
                System.out.print("Inserisci il numero di pagine: ");
                pages = Integer.parseInt(scanner.nextLine());
                if (pages <= 0){
                    System.out.println("il numero di pagine deve essere maggiore di zero");
                }
            } while (pages <= 0);
            String author = "";
            do {
                System.out.print("Inserisci l'autore del libro: ");
                author = scanner.nextLine();
                if (author.length() == 0){
                    System.out.println("l' autore non può essere vuoto");
                }
            } while (author.length() == 0);
            String publisher = "";
            do {
                System.out.print("Inserisci l'editore del libro: ");
                publisher = scanner.nextLine();
                if (publisher.length() == 0){
                    System.out.println("l'editore non può essere vuoto");
                }
            } while (publisher.length() == 0);

            Book book = new Book(title, pages, author, publisher);
            bookList[i] = book;
            scanner.close();

            System.out.println("*******************");
            System.out.println("Ecco il tuo catalogo dei libri:");
            System.out.println("*******************");
            System.out.println(Arrays.toString(bookList));
            System.out.println("*******************");

            try(FileWriter writer = new FileWriter("./books.txt")){
                for (Book book : bookList){
                    writer.write(book.toString() + "/n");
                }
            } catch(IOException e){
                e.printStackTrace();
            }

        }


            // FILE WRITER FileWriter writer = null;
//            try{
//                writer = new FileWriter(FILE_PATH, true);
//                for (Book currentBook : bookList){
//                    writer.write(currentBook.toString() + "/n");
//                }
//            } catch (IOException e){
//                System.out.println("Non è stato possibile creare il file");
//                System.out.println(e.getMessage());
//            } finally {
//                if (writer != null){
//                    try{
//                        writer.close();
//                    } catch (IOException e){
//                        e.printStackTrace();
//                    }
//                }
//            }
    }
}
