public class SavingsAccount {
    private double savingBalance;
    private static double annualInterestRate;

    public SavingsAccount(double initialBalance) {
        this.savingBalance = initialBalance;
    }

    public static void modifyInterestRate(double newRate) {
        if (newRate > 0.0 && newRate < 1.0) {
            annualInterestRate = newRate;
        } else {
            throw new IllegalArgumentException("Interest rate must be > 0.0 and < 1.0");
        }
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingBalance * annualInterestRate) / 12.0;
        savingBalance += monthlyInterest;
    }

    public double getSavingBalance() {
        return savingBalance;
    }
}
