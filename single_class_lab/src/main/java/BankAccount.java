import com.sun.source.tree.ClassTree;

public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private double balance;

    private String accountType;

    private double overdraft;

    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber, String accountType, double overdraft) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.accountType = accountType;
        this.overdraft = overdraft;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amountToDeposit) {
        this.balance += amountToDeposit;
    }

//    public void withdrawal(double amountToWithdraw) {
//        this.balance -= amountToWithdraw;
//    }

    public void withdrawal(double amountToWithdraw) {
        double maxWithdrawal = balance + overdraft;
        if(amountToWithdraw > maxWithdrawal) {
            System.out.println("You cannot withdraw that amount of money. Your maximum withdrawal amount is: " + maxWithdrawal);
        } else {
            this.balance -= amountToWithdraw;
        }
    }

    public void payInterest() {
        this.balance = balance + (balance * 2.5/100);
    }

    public void payInterestByAccountType() {
        if(accountType == "current") {
            this.balance = balance + (balance * 2.5/100);
        }
        if(accountType == "savings") {
            this.balance = balance + (balance * 5/100);
        }
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
