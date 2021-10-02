package tamrin62;

public class Customer {
    private String name;
    private int nationalCode;
    private String phoneNumber;
    private Account[] accounts;
    private int accountIndex;
    private int accountAmountPlus;
    private int accountAmountMines;

    public String getName() {
        return name;
    }


    public Account[] getAccounts() {
        return accounts;
    }

    public Customer(String name) {
        this.name = name;
        accounts = new Account[10];

    }


    public void addSavingAccount(int accountNumber, double balanceOpening, MyDate date) {
        accounts[accountIndex++] = new SavingAccount(accountNumber, balanceOpening, date);
    }

    public void addLoanAccount(int accountNumber, double balanceOpening, MyDate date, double loanAmount, int loanTerm) {
        accounts[accountIndex++] = new LoanAccount(accountNumber, balanceOpening, date, loanAmount, loanTerm);
    }

    public void addCheckingAccount(int accountNumber, double balanceOpening, MyDate date) {
        accounts[accountIndex++] = new CheckingAccount(accountNumber, balanceOpening, date);
    }

}
