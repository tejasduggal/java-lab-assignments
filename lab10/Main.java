public class Main {
    public static void main(String[] args) {

        // Abstract class reference → child objects
        Account savingsAccount = new SavingsAccount(10000);
        Account currentAccount = new CurrentAccount(10000);

        // Common method call
        System.out.println("\n--- Deposits ---");
        savingsAccount.deposit(2000);
        currentAccount.deposit(3000);

        // Abstract method (polymorphic behavior)
        System.out.println("\n--- Interest Calculation ---");
        savingsAccount.calculateInterest();   // Savings logic (4.5%)
        currentAccount.calculateInterest();   // Current logic (0.5%)
    }
}
