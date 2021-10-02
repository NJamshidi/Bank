package tamrin62;

public class Account {

    protected int accountNumber;
    protected double currentBalance;
    protected double balanceOpening;
    protected MyDate date;
    protected Transactions[] transactions = new Transactions[100];
    protected int indexOfTransactions = 0;


    public Account(int accountNumber, double balanceOpening, MyDate date) {
        this.accountNumber = accountNumber;
        this.balanceOpening = balanceOpening;
        this.date = date;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + currentBalance +
                ", balanceOpening=" + balanceOpening +
                ", myDate=" + date +
                '}';
    }

    public boolean withdraw(double amountToWithdraw, int year, int month, int day) {
        if (currentBalance > amountToWithdraw) {
            currentBalance -= amountToWithdraw;
            transactions[indexOfTransactions++] = new Transactions(TypeOfTransactions.WITHDRAW, new MyDate(year, month, day), amountToWithdraw);
            return true;
        } else
            return false;
    }

    public boolean deposit(double amountToDeposit, int year, int month, int day) {
        currentBalance += amountToDeposit;
        transactions[indexOfTransactions++] = new Transactions(TypeOfTransactions.DEPOSIT, new MyDate(year, month, day), amountToDeposit);
        return true;
    }

    public void viewTransactions() {
        int count = 0;
        for (Transactions transaction : transactions
        ) {
            if (transaction == null)
                return;
            if (transaction == null && count == 0) {
                System.out.println("there is no transaction for this account");
                return;
            }
            System.out.println(transaction.toString());
            count++;
        }
    }


}