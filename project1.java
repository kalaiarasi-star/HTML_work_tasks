import java.util.*;
abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void displayAccountDetails();
}

class Customer {
    String accountNumber;
    String accountHolderName;
    String accountType;

    public Customer(String accountNumber, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }
}
class BankAccount extends Account {
    private Customer customer;  

    public BankAccount(Customer customer, double balance) {
        super(balance);         
        this.customer = customer;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.printf("Deposit Successful. Updated Balance: $%.2f\n", balance);
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (balance < amount) {
            System.out.printf("Insufficient funds. Current Balance: $%.2f\n", balance);
        } else {
            balance -= amount;
            System.out.printf("Withdrawal Successful. Updated Balance: $%.2f\n", balance);
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + customer.accountNumber);
        System.out.println("Account Holder Name: " + customer.accountHolderName);
        System.out.println("Account Type: " + customer.accountType);
        System.out.printf("Balance: $%.2f\n", balance);
    }
}

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number:");
        String a = sc.nextLine();

        System.out.println("Enter the account holder's name:");
        String b = sc.nextLine();

        System.out.println("Enter the initial balance:");
        double c = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the account type:");
        String d = sc.nextLine();
        Customer cust = new Customer(a, b, d);
        BankAccount account = new BankAccount(cust, c);

        account.displayAccountDetails();

        System.out.println("\nEnter deposit amount:");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("\nEnter withdrawal amount:");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayAccountDetails();
    }
}



