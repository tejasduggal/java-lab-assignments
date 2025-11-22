public class CurrentAccount extends Account {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.005;   // 0.5%
        balance += interest;
        System.out.println("Current Account interest added: ₹" + interest +
                           ". Updated Balance = ₹" + balance);
    }
}
