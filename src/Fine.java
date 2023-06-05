public class Fine {
    private int fineID;
    private Borrow borrow;
    private double amount;
    private boolean paid;

    public Fine(int fineID, Borrow borrow, double amount) {
        this.fineID = fineID;
        this.borrow = borrow;
        this.amount = amount;
        this.paid = false;
    }

    public int getFineID() {
        return fineID;
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}