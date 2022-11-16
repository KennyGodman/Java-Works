package com.Godman.Godman;

import java.util.Scanner;

import static java.lang.System.exit;


public class ATM {
    private static Bank godmanBank = new Bank();
    public static void main(String[] args) {
        startAtm();

    }
    private  static void startAtm(){
        String mainmMenu = """
                Welcome to Godman Bank
                1 -> Create Acount
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> CheckBalance
                6 -> Exit
                """;
        String userInput = input(mainmMenu);
        switch (userInput){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> transfer();
            case "5" -> checkBalance();
            case "6" -> exit(6);

        }
    }

    private static void checkBalance() {
        String accountName = input("Enter your account name");
        String pin = input("Enter your desired pin");
        display(String.format("Balance is %d", godmanBank.findAccount(accountName).getBalance(pin)));
        startAtm();
    }

    private static void transfer() {
    }

    private static void withdraw() {
    }

    private static void deposit() {
        String accountNumber = input("Enter your account number");
        int amount = inputInt("Enter amount");
        try{
            godmanBank.deposit(amount, accountNumber);
        }
        catch (InvalidAmountException ex){
            display(ex.getMessage());
            deposit();
        }
        startAtm();
    }

    private static int inputInt(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    private static void display(String prompt) {
        System.out.println(prompt);
    }

    private static void createAccount() {
       String accountName = input("Enter your account name");
       String pin = input("Enter your desired pn");
       godmanBank.createAccountFor(accountName, pin);
       display(String.format("Account created for %s", accountName));
       startAtm();

    }

    private static String input(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
