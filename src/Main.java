import java.util.*;

public class LibrarySystem {
    private static int bookIDCounter = 1;
    private static int studentIDCounter = 1;
    private static int borrowIDCounter = 1;
    private static int fineIDCounter = 1;
    private static int paymentIDCounter = 1;

    private List<Book> books;
    private List<Student> students;
    private List<Borrow> borrows;
    private List<Fine> fines;
    private List<Payment> payments;

    public LibrarySystem() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.borrows = new ArrayList<>();
        this.fines = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    public void addBook(String title, String author, String publisher, int quantity) {
        Book book = new Book(bookIDCounter++, title, author, publisher, quantity);
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

    public void addStudent(String name, String email, String phoneNumber) {
        Student student = new Student(studentIDCounter++, name, email, phoneNumber);
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void borrowBook(Student student, Book book) {
        if (book.getAvailableQuantity() > 0) {
            Borrow borrow = new Borrow(borrowIDCounter++, book, student, new Date());
            borrows.add(borrow);
            book.borrowBook();
            student.borrowBook(book);
        } else {
            student.reserveBook(book);
        }
    }

    public void returnBook(Student student, Book book) {
        Borrow borrow = null;
        for (Borrow b : borrows) {
            if (b.getBook().equals(book) && b.getStudent().equals(student) && b.getReturnDate() == null) {
                borrow = b;
                break;
            }
        }
        if (borrow != null) {
            borrow.setReturnDate(new Date());
            book.returnBook();
            student.returnBook(book);
            double daysLate = (new Date().getTime() - borrow.getReturnDate().getTime()) / (1000 * 60 * 60 * 24);
            if (daysLate > 0) {
                double fineAmount = daysLate * 0.5;
                Fine fine = new Fine(fineIDCounter++, borrow, fineAmount);
                fines.add(fine);
                borrow.addFine(fine);
            }
        }
    }

    public void payFine(Fine fine, double amount) {
        if (!fine.isPaid()) {
            double remainingAmount = fine.getAmount() - amount;
            if (remainingAmount < 0) {
                Payment payment = new Payment(paymentIDCounter++, fine, amount, new Date());
                payments.add(payment);
                fine.setPaid(true);
            }
        }}}