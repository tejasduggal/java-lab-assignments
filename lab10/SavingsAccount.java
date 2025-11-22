public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.045;   // 4.5%
        balance += interest;
        System.out.println("Savings Account interest added: ₹" + interest +
                           ". Updated Balance = ₹" + balance);
    }
}
