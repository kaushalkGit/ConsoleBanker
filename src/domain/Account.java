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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
