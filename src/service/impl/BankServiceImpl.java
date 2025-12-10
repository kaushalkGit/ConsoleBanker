package service.impl;

import domain.Account;
import service.BankService;

import java.util.UUID;

public class BankServiceImpl implements BankService {


    @Override
    public String openAccount(String name, String email, String accountType) {
        String customerID= UUID.randomUUID().toString();

        //Change Later
        String accountNumber=UUID.randomUUID().toString();
        Account a=new Account(0,accountNumber,accountType,customerID);
        //SAVE


        return "";
    }
}
