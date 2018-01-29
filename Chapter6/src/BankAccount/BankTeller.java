package BankAccount;//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Project 6.5
// Develop a new class called BankAccount.BankAccount. A bank account has an owner’s name and a balance.
// Be sure to include a constructor that allows a client to supply the owner’s name and an initial
// balance. A bank account needs accessors for the name and balance, mutators for making
// deposits and withdrawals, and a toString method. Test-drive your new class with a program
// similar to the one used to test the Student.Student class in Section 6.3.
//

import java.io.IOException;
import java.util.Scanner;

public class BankTeller {
    public static void main (String[] args) throws IOException, BadActorException {

        BankAccount user = new BankAccount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the bank of hbh7! Please enter your name to begin.");
        user.setName(scanner.next().toLowerCase());

        user.login();
        System.out.println("Success! Now logged in as " + user.getName());

        while (true) {
            System.out.println();
            System.out.println("What would you like to do? Options are: (type word or capital letters in option)");
            System.out.println("[Deposit] [Withdraw] [CheckBalance] [ShowAccount] [ShowHistory] [Logout]");
            System.out.print("Option: ");
            String action = scanner.next();

            if(action.toLowerCase().equals("deposit") || action.toLowerCase().equals("d")) {
                System.out.print("How much would you like to deposit? ");
                double depositAmount = 0;
                try {
                    depositAmount = scanner.nextDouble();
                    if(depositAmount < 0) {
                        throw new BadActorException();
                    }
                } catch(BadActorException e) {
                    System.err.println("HACKER ALERT!!! Kicking from system!");
                    System.err.flush();
                    System.exit(0);
                } catch(Exception e) {
                    scanner.next();
                    System.err.println("Please input a valid amount to deposit!");
                    System.err.flush();
                    continue;
                }

                if(user.doTransaction("deposit", depositAmount)) {
                    System.out.println("Your transaction was successful!");
                    System.out.println("New Balance: " + user.getBankBalance());
                } else {
                    System.err.println("Your transaction was NOT successful! I have legit no idea how you did that.");
                    System.out.println();
                }

            } else if(action.toLowerCase().equals("withdraw") || action.toLowerCase().equals("w")) {
                System.out.print("How much would you like to withdraw? ");
                double withdrawAmount = 0;
                try {
                    withdrawAmount = scanner.nextDouble();
                    if(withdrawAmount < 0) {
                        throw new BadActorException();
                    }
                } catch(BadActorException e) {
                    System.err.println("HACKER ALERT!!! Kicking from system!");
                    System.err.flush();
                    System.exit(0);
                } catch(Exception e) {
                    scanner.next();
                    System.err.println("Please input a valid amount to withdraw!");
                    System.err.flush();
                    continue;
                }

                if(user.doTransaction("withdraw", withdrawAmount)) {
                    System.out.println("Your transaction was successful!");
                    System.out.println("New Balance: " + user.getBankBalance());
                    System.out.println();
                } else {
                    System.err.println("Your transaction was NOT successful! Perhaps you don't have enough funds?");
                }

            } else if(action.toLowerCase().equals("checkbalance") || action.toLowerCase().equals("checkbal") || action.toLowerCase().equals("cb")) {
                System.out.println("Your account balance is $" + user.getBankBalance());

            } else if(action.toLowerCase().equals("showaccount") || action.toLowerCase().equals("sa")) {
                System.out.println(user);

            } else if(action.toLowerCase().equals("showhistory") || action.toLowerCase().equals("sh")) {
                System.out.println(user.accountHistory());

            } else if(action.toLowerCase().equals("logout") || action.toLowerCase().equals("l")) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.err.println("Unknown action.");
            }
        }

    }
}