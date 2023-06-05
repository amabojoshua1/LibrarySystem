import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private String email;
    private String phoneNumber;
    private List<Book> borrowedBooks;
    private List<Book> reservedBooks;

    public Student(int studentID, String name, String email, String phoneNumber) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

    public void borrowBook(Book book) {
        book.borrowBook();
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        book.returnBook();
        borrowedBooks.remove(book);
    }

    public void reserveBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservation(Book book) {
        reservedBooks.remove(book);
    }
}