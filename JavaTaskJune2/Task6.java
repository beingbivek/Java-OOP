package JavaTaskJune2;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    public TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class Task6 {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("Summer Love", "Subin Bhattarai");
        fictionBook.displayDetails();

        NonFictionBook nonFictionBook = new NonFictionBook("Jiwan Kada Ki Phool", "Dr. Dhruba Kumar");
        nonFictionBook.displayDetails();
        TechnicalBook technicalBook = new TechnicalBook("Introduction to Algorithms", "Thomas H. Cormen");
        technicalBook.displayDetails();
    }
}
