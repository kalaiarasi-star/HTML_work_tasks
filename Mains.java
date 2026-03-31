import java.util.*;
abstract class BankAccount {
protected String accountNumber;
protected String accountHolderName;
protected double balance;
BankAccount(String accountNumber, String accountHolderName, double balance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
}
abstract void deposit(double amount);
abstract void withdraw(double amount);
abstract void displayInfo();
}
class SavingsAccount extends BankAccount {
SavingsAccount(String accountNumber, String accountHolderName, double balance){
super(accountNumber, accountHolderName, balance);
}
void deposit(double amount) {
if(amount <= 0){
System.out.println("Invalid deposit amount");
} else {
balance += amount;
System.out.printf("Deposit Successful. Updated Balance: $%.2f\n", balance);
}
}
void withdraw(double amount) {
if(amount <= 0 || amount > balance){
System.out.println("Invalid withdrawal");
} else {
balance -= amount;
System.out.printf("Withdrawal Successful. Updated Balance: $%.2f\n", balance);
}
}
void displayInfo() {
System.out.println("Account Type: Savings Account");
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.printf("Balance: $%.2f\n", balance);
}
}
class CurrentAccount extends BankAccount {
CurrentAccount(String accountNumber, String accountHolderName, double balance) {
super(accountNumber, accountHolderName, balance);
}
void deposit(double amount) {
if(amount <= 0){
System.out.println("Invalid deposit amount");
} else {
balance += amount;
System.out.printf("Deposit Successful. Updated Balance: $%.2f\n", balance);
}
}
void displayInfo() {
System.out.println("Account Type: Current Account");
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.printf("Balance: $%.2f\n", balance);
}
}
public class Mains {
public static void main(String[] args) {
Scanner S = new Scanner(System.in);
System.out.println("Enter account type (1 for Savings, 2 for Current):");
int d = S.nextInt();
S.nextLine();
System.out.println("Enter account number:");
String accountNumber = S.nextLine();
System.out.println("Enter account holder name:");
String accountHolder = S.nextLine();
System.out.println("Enter balance:");
double balance = S.nextDouble();
BankAccount A;
if(d == 1){
A = new SavingsAccount(accountNumber,accountHolder, balance);
} else {
A = new CurrentAccount(accountNumber,accountHolder,balance);
}
A.displayInfo();
System.out.println("\nEnter deposit amount:");
double depositAmount = S.nextDouble();
A.deposit(depositAmount);
System.out.println("\nEnter withdrawal amount:");
double withdrawAmount = S.nextDouble();
A.withdraw(withdrawAmount);
System.out.println("\nUpdated Account Details:");
A.displayInfo();
}
}