package domain;

public class Account {
    private String accountNumber;
    private String customerID;
    private Double balance;
    private String accountType;

    public Account(double balance, String accountNumber, String accountType, String customerID) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customerID = customerID;
    }
}
