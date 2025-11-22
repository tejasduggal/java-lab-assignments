public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New Balance = ₹" + balance);
    }

    public abstract void calculateInterest();
}
