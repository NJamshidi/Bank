package tamrin62;

public class SavingAccount extends Account {
    private static final double monthlyProfit = 0.1;

    public SavingAccount(int accountNumber, double currentBalance, MyDate date) {
        super(accountNumber, currentBalance, date);
    }


    @Override
    public String toString() {
        return "Saving Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + currentBalance +
                ", balanceOpening=" + balanceOpening +
                ", myDate=" + date +
                ", monthlyProfit=" + monthlyProfit +
                '}';
    }

    public void calculateInterests() {
        currentBalance += monthlyProfit * currentBalance;
    }
}
