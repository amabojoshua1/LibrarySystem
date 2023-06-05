import java.util.Date;

public class Payment {
    private int paymentID;
    private Fine fine;
    private double amount;
    private Date paymentDate;

    public Payment(int paymentID, Fine fine, double amount, Date paymentDate) {
        this.paymentID = paymentID;
        this.fine = fine;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public Fine getFine() {
        return fine;
    }

    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
}