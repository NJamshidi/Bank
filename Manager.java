package tamrin62;

import java.util.Random;

public class Manager {
    private static Bank bank;
    private static Random random;
    private Transactions[] transactions;
    private int indexOfTransactions;

    public Manager(Bank bank) {
        this.bank = bank;
        this.random = new Random();
        transactions = new Transactions[100];

    }

    public static void addNewAccount(String name, double balanceOpening, MyDate date, String typeAccount, double loanAmount, int loanTerm) {

        Customer customer = null;
        for (Customer c : bank.getCustomers())
            if (c != null && c.getName().equals(name)) {
                customer = c;
                break;
            }
        if (customer == null)
            customer = new Customer(name);
        int accountNumber = 100000 + random.nextInt(1000000);
        Account account = new Account(accountNumber, balanceOpening, date);
        if (typeAccount.equals("l"))
            customer.addLoanAccount(accountNumber, balanceOpening, date, loanAmount, loanTerm);
        else if (typeAccount.equals("c"))
            customer.addCheckingAccount(accountNumber, balanceOpening, date);
        else if (typeAccount.equals("s"))
            customer.addSavingAccount(accountNumber, balanceOpening, date);
        bank.addCustomer(customer);
    }

    public void viewAccount(String name) {
        Customer customer = null;
        for (Customer c : bank.getCustomers())
            if (c != null && c.getName().equals(name)) {
                customer = c;
                break;
            }
        if (customer == null)
            System.out.println("not exist");
        else
            for (Account account : customer.getAccounts()) {
                if (account == null) {
                    break;
                }
                System.out.println("account: " + account.toString());
            }
    }

    public void deposit(int accountNumber, double amount, MyDate date) {
        for (Customer customer : bank.getCustomers())
            if (customer != null)
                for (Account account : customer.getAccounts()) //333-444
                    if (account != null && account.getAccountNumber() == accountNumber) { //333==444
                        double c = amount + account.getCurrentBalance();
                        account.setCurrentBalance(c);
                        transactions[indexOfTransactions++] = new Transactions(TypeOfTransactions.DEPOSIT, date, amount);
                        System.out.println("deposit done!");
                        return;
                    }
        System.out.println("deposit do not done!");

    }


    public void withDraw(int accountNumber, double amount, MyDate date) {
        for (Customer customer : bank.getCustomers())
            for (Account account : customer.getAccounts())
                if (account.getAccountNumber() == accountNumber) {
                    if (account.getCurrentBalance() >= amount) {
                        double c = account.getCurrentBalance() - amount;
                        account.setCurrentBalance(c);
                        transactions[indexOfTransactions++] = new Transactions(TypeOfTransactions.WITHDRAW, date, amount);
                        System.out.println("withDraw done!");
                        return;
                    }
                }
        System.out.println("deposit do not done!");
    }


    public double calculateInteres(int accountNumber) {
        double total = 0;

        for (Customer customer : bank.getCustomers())
            for (Account account : customer.getAccounts())
                if (account.getAccountNumber() == accountNumber) {
                    total = account.getCurrentBalance() * .10;

                    return total;
                }
        return total;

    }


    public void getTransactionInfo(int accountNumber) {
        int count = 0;
        for (Transactions transaction : transactions) {
            if (transaction == null)
                return;
            if (transaction == null && count == 0) {
                System.out.println("No transaction exists ");
                return;
            }
            System.out.println(transaction.toString());
        }
    }

}

