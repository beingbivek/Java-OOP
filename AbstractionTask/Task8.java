package AbstractionTask;

import java.util.Scanner;

interface LibraryItem {
    String getTitle();

    String getAuthor();

    int getYear();

    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void borrowItem() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void returnItem() {
        available = true;
        System.out.println("Book returned successfully.");
    }
}


public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book = new Book("The Alchemist", "Paulo Coelho", 1988, true);

        System.out.println("Library Item Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + (book.isAvailable() ? "Yes" : "No"));

        System.out.println("\nDo you want to borrow the book? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            book.borrowItem();
        }

        System.out.println("Available after action: " + (book.isAvailable() ? "Yes" : "No"));

        System.out.println("\nDo you want to return the book? (yes/no): ");
        choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            book.returnItem();
        }

        System.out.println("Available after return: " + (book.isAvailable() ? "Yes" : "No"));

        sc.close();
    }
}
