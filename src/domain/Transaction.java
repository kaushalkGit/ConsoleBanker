package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private Type type;
    private String accountNumber;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String accountNumber, double amount, String id, LocalDateTime timestamp, Type type) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.id = id;
        this.timestamp = timestamp;
        this.type = type;
    }
}
