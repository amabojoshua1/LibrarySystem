import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Borrow {
private int borrowID;
private Book book;
private Student student;
private Date borrowDate;
private Date returnDate;
private List<Fine> fines;

public Borrow(int borrowID, Book book, Student student, Date borrowDate) {
        this.borrowID = borrowID;
        this.book = book;
        this.student = student;
        this.borrowDate = borrowDate;
        this.returnDate = null;
        this.fines = new ArrayList<>();
        }

public int getBorrowID() {
        return borrowID;
        }

public Book getBook() {
        return book;
        }

public Student getStudent() {
        return student;
        }

public Date getBorrowDate() {
        return borrowDate;
        }

public Date getReturnDate() {
        return returnDate;
        }

public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
        }

public List<Fine> getFines() {
        return fines;
        }

public void addFine(Fine fine) {
        fines.add(fine);
        }
        }