public class Book {
    private int bookID;
    private String title;
    private String author;
    private String publisher;
    private int quantity;
    private int availableQuantity;

    public Book(int bookID, String title, String author, String publisher, int quantity) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.availableQuantity = quantity;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void updateQuantity(int quantity) {
        this.quantity += quantity;
        this.availableQuantity += quantity;
    }

    public void borrowBook() {
        if (availableQuantity > 0) {
            availableQuantity--;
        }
    }

    public void returnBook() {
        availableQuantity++;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}