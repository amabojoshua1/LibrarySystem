import java.util.ArrayList;
import java.util.List;

public class Admin {
    private int adminID;
    private String name;
    private String email;
    private String phoneNumber;
    private List<Student> students;
    private List<Book> books;

    public Admin(int adminID, String name, String email, String phoneNumber) {
        this.adminID = adminID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.students = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public int getAdminID() {
        return adminID;
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

    public List<Student> getStudents() {
        return students;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void updateBookDetails(Book book, String title, String author, String publisher) {
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);
    }
}