package NewJavaTask.Encapsulation;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable = true;

    // setter methods
    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setPublicationYear(int year) {
        publicationYear = year;
    }

    // getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // method to borrow the book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    // method to return the book
    public void returnBook() {
        isAvailable = true;
    }

    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("The Alchemist");
        myBook.setAuthor("Paulo Coelho");
        myBook.setPublicationYear(1988);

        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Year: " + myBook.getPublicationYear());

        if (myBook.borrowBook()) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }

        myBook.returnBook();
        System.out.println("Book returned.");
    }
}
