package app;

import service.BankService;
import service.impl.BankServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BankService bankService=new BankServiceImpl();
        System.out.println("Welcome to The Console Bank Services.");
        boolean running=true;
        while(running){
            System.out.println("""
                1. Open Account
                2. Deposite
                3. Withdraw
                4. Transfer
                5. Account Statement
                6. List Account
                7. Search Account by Customer name
                8. Exit
                """);
            System.out.print("Choose : ");
            String choice=scanner.nextLine().trim();
            System.out.println("Choice : "+choice);

            switch(choice){
                case "0" -> running=false;
                case "1" -> openAccount(scanner, bankService);
                case "2" -> deposite(scanner);
                case "3" -> withdraw(scanner);
                case "4" -> transfer(scanner);
                case "5" -> statement(scanner);
                case "6" -> listAccounts(scanner);
                case "7" -> searchAccounts(scanner);
            }
        }
    }

    private static void openAccount(Scanner scanner, BankService bankService) {
        System.out.println("Customer name: ");
        String name=scanner.nextLine().trim();
        System.out.println("Customer email: ");
        String email=scanner.nextLine().trim();
        System.out.println("Account Type (SAVINGS/CURRENT): ");
        String type=scanner.nextLine().trim();
        System.out.println("Initial deposite (optional, blank for 0): ");
        String amountstr=scanner.nextLine().trim();
        Double initial = Double.valueOf(amountstr);
        bankService.openAccount(name,email,type);

    }

    private static void deposite(Scanner scanner) {
    }

    private static void withdraw(Scanner scanner) {
    }

    private static void transfer(Scanner scanner) {
    }

    private static void statement(Scanner scanner) {
    }

    private static void listAccounts(Scanner scanner) {
    }

    private static void searchAccounts(Scanner scanner) {
    }


}
