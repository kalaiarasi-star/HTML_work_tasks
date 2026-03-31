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
    String accNum;
    String accHolderName;
    String accType;

    public Customer(String accNum, String accHolderName, String accType) {
        this.accNum= accNum;
        this.accHolderName = accHolderName;
        this.accType = accType;
    }
}

class BankAccount extends Account {
    Customer cus;

    public BankAccount(Customer cus, double balance) {
        super(balance);
        this.cus = cus;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful. Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful. Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + cus.accNum);
        System.out.println("Account Holder Name: " + cus.accHolderName);
        System.out.println("Account Type: " + cus.accType);
        System.out.println("Balance: " + balance);
    }
}

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo= sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Account Type: ");
        String type = sc.nextLine();

        Customer cust = new Customer(accNo, name, type);
        BankAccount account = new BankAccount(cust, bal);

        account.displayAccountDetails();

        System.out.print("\nEnter Deposit Amount: ");
        double d = sc.nextDouble();
        account.deposit(d);

        System.out.print("\nEnter Withdrawal Amount: ");
        double w = sc.nextDouble();
        account.withdraw(w);

        account.displayAccountDetails();
    }
}