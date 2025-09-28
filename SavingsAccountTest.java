public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate(0.04); // 4% annual

        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.printf("Final balance for saver1: $%.2f%n", saver1.getSavingBalance());
        System.out.printf("Final balance for saver2: $%.2f%n", saver2.getSavingBalance());
    }
}