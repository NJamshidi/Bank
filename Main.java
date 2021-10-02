package tamrin62;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;


        Bank bank = new Bank();
        Manager manager = new Manager(bank);
//        managerPageWhile:
        while (true) {
            showPage();
            int selection = input.nextInt();
            switch (selection) {
                case 1: {
                    System.out.print("what kind of account do you want to open? 'c' for CheckingAccount," +
                            " 's' for SavingAccount, 'l' for LoanAccount: ");
                    String typeAccount = input.next();
                    System.out.println("name:");
                    String name = input.next();
                    System.out.println("balance:");
                    double balance = input.nextDouble();
                    System.out.println("year:");
                    int y = input.nextInt();
                    System.out.println("month:");
                    int m = input.nextInt();
                    System.out.println("day:");
                    int d = input.nextInt();
                    MyDate date = new MyDate(y, m, d);
                    double loanAmount = 0;
                    int loanTerm = 0;

                    if (typeAccount.equals("l")) {
                        System.out.print("Enter amount of loan: ");
                        loanAmount = input.nextDouble();

                        System.out.print("Enter count of mouth that you will return it: ");
                        loanTerm = input.nextInt();
                    }
                    Manager.addNewAccount(name, balance, date, typeAccount, loanAmount, loanTerm);
                }
                break;

                case 2: {
                    System.out.println("name:");
                    String name = input.next();
                    manager.viewAccount(name);
                }
                break;
//                break managerPageWhile;
                case 3: {
                    System.out.println("Enter Amount U Want to Deposit : ");
                    double amount = input.nextDouble();
                    System.out.println("Enter accountNumber : ");
                    int accountNumber = input.nextInt();
                    System.out.println("year:");
                    int y = input.nextInt();
                    System.out.println("month:");
                    int m = input.nextInt();
                    System.out.println("day:");
                    int d = input.nextInt();
                    MyDate date = new MyDate(y, m, d);
                    manager.deposit(accountNumber, amount, date);
                }
                break;
                case 4: {
                    System.out.println("Enter Amount U Want to withDraw : ");
                    double amount = input.nextDouble();
                    System.out.println("Enter accountNumber : ");
                    int accountNumber = input.nextInt();
                    System.out.println("year:");
                    int y = input.nextInt();
                    System.out.println("month:");
                    int m = input.nextInt();
                    System.out.println("day:");
                    int d = input.nextInt();
                    MyDate date = new MyDate(y, m, d);
                    manager.withDraw(accountNumber, amount, date);
                }
                break;
                case 5: {
                    System.out.println("Enter accountNumber : ");
                    int accountNumber = input.nextInt();
                    manager.calculateInteres(accountNumber);
                }

                break;
                case 6: {
                    System.out.println("Enter accountNumber : ");
                    int accountNumber = input.nextInt();
                    manager.getTransactionInfo(accountNumber);
                }

                break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid selection!");

            }
        }
    }


    public static void showPage() {
        System.out.println("1. Add new account\n" +
                " 2. View accounts \n" +
                " 3. Withdraw\n" +
                " 4. Deposit\n" +
                " 5. Calculate interests\n" +
                " 6. View Transactions\n" +
                " 7. Exit");
        System.out.print("> ");
    }
}
