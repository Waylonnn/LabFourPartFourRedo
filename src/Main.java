public class Main {
    public static void main(String[] args) {
        double balance = 5000;
        double interestRate = 0.17; // Monthly interest rate
        double balanceAfterOneMonth = balance * (1 + interestRate);
        double balanceAfterTwoMonths = balanceAfterOneMonth * (1 + interestRate);

        System.out.println("Credit Card Balance: $" + balance);
        System.out.println("Credit Card Balance after One Month: $" + balanceAfterOneMonth);
        System.out.println("Credit Card Balance after Two Months: $" + balanceAfterTwoMonths);
    }
}