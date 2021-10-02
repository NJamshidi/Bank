package tamrin62;

public class LoanAccount extends Account {
    private final double loanAmount;
    private static final double interestRate = 0.1;
    private final int loanTerm;
    private static final double monthlyProfit = 0.1;

    public LoanAccount(int accountNumber, double balanceOpening, MyDate date, double loanAmount, int loanTerm) {
        super(accountNumber, balanceOpening, date);
        this.loanAmount = loanAmount;
        this.loanTerm = loanTerm;
    }

    @Override
    public String toString() {
        return "Loan Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + currentBalance +
                ", balanceOpening=" + balanceOpening +
                ", myDate=" + date +
                ", loanAmount=" + loanAmount +
                ", interestRate=" + interestRate +
                ", loanTerm=" + loanTerm +
                ", monthlyProfit=" + monthlyProfit +
                '}';
    }

    public void calculateInterests() {
        currentBalance += monthlyProfit * currentBalance;
    }

}
