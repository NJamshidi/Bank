package tamrin62;

public class CheckingAccount extends Account {
    private static final double fees = 700;
    private static final double withdrawalRestrictions = 2000000;

    public CheckingAccount(int accountNumber, double balanceOpening, MyDate date) {
        super(accountNumber, balanceOpening, date);
    }

    @Override
    public String toString() {
        return "Checking Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + currentBalance +
                ", balanceOpening=" + balanceOpening +
                ", myDate=" + date +
                ", fees=" + fees +
                ", withdrawalRestrictions=" + withdrawalRestrictions +
                '}';
    }

    @Override
    public boolean withdraw(double amountToWithdraw, int year, int month, int day) {
        if (amountToWithdraw < withdrawalRestrictions) {
            currentBalance -= fees;
            return super.withdraw(amountToWithdraw, year, month, day);
        } else {
            System.out.println("limits!");
            return false;
        }
    }
}
