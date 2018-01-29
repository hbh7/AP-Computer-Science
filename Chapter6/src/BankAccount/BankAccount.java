// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Bank Account Class
//

package BankAccount;//

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {

    // Instance variables
    private String name;
    private ArrayList<String> bankTransactions = new ArrayList<>();
    private int bankAccountID;
    private double bankBalance;

    // Constructor method
    public BankAccount() {
        name = "";
        setBankAccountID(0);
    }

    public void login() throws IOException {
        loadDatabase(getName());
    }

    public void setName (String nm) {
        name = nm;
    }

    public String getName (){
        return name;
    }

    private void setBankAccountID(int ID){
        if(ID == 0) {
            bankAccountID = ThreadLocalRandom.current().nextInt(0, 1000001);
        } else {
            bankAccountID = ID;
        }

    }

    public int getBankAccountID(){
        return bankAccountID;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    private void setBankBalance(double newAmount) {
        bankBalance = newAmount;
    }


    private void addTransaction(String action, double amount) throws IOException {
        if(action.equals("deposit")) {
            bankTransactions.add("Transaction " + bankTransactions.size() +
                                 "; Amount: " + amount +
                                 "; New Balance: " + (getBankBalance()+amount));
        } else if (action.equals("withdraw")) {
            bankTransactions.add("Transaction " + bankTransactions.size() +
                                 "; Amount: " + amount +
                                 "; New Balance: " + (getBankBalance()-amount));
        } else {
            System.err.println("You hit an error!");
        }

        saveDatabase(name);
    }


    public boolean doTransaction(String action, double amount) throws IOException {
        if(action.equals("deposit")) {
            addTransaction("deposit", amount);
            setBankBalance(getBankBalance() + amount);
            return true;
        } else if (action.equals("withdraw")) {
            if(getBankBalance() > amount) {
                addTransaction("withdraw", amount);
                setBankBalance(getBankBalance() - amount);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    private void loadDatabase(String name) throws IOException {

        if(name.equals("")) {
            System.err.println("No data available to load.");
            return;
        }

        // The name of the file to open.
        String fileName = "BankData/" + name + ".txt";

        // This will reference one line at a time
        String line;
        int lineCount = 1;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null && !line.equals("")) {
                if(lineCount == 1){
                    lineCount++;
                } else if(lineCount == 2) {
                    lineCount++;
                    String splitLines[] = line.split(":");
                    setBankAccountID(Integer.parseInt(splitLines[1].trim()));
                } else {
                    lineCount++;
                    bankTransactions.add(line);
                }

            }
            if(bankTransactions.size() == 0) {
                setBankBalance(0.0);
            } else {
                String splitString[] = bankTransactions.get(bankTransactions.size()-1).split(":");
                setBankBalance(Double.parseDouble(splitString[2].trim()));
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.err.println("No user records found. Creating new account");
            new File("BankData").mkdirs();
            new File("BankData/" + name + ".txt").createNewFile();
        }
        catch(IOException ex) {
            System.err.println("Error reading account data: '" + fileName + "'");
            ex.printStackTrace();
        }
    }

    private void saveDatabase(String name) throws IOException {
        // The name of the file to open.
        String fileName = "BankData/" + name + ".txt";

        new File("BankData").mkdirs();
        new File(fileName).createNewFile();

        File fileToDelete = new File(fileName);
        fileToDelete.delete();

        try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("hbh7 Bank Account User Name: " + getName());
            bufferedWriter.newLine();
            bufferedWriter.write("Account ID: " + getBankAccountID());
            bufferedWriter.newLine();
            for (Object line : bankTransactions.toArray()) {
                bufferedWriter.write(line.toString());
                bufferedWriter.newLine();
            }

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.err.println("Error writing account data: '" + fileName + "'");
            ex.printStackTrace();
        }

    }

    public String accountHistory(){
        // Construct and return a string representation of the student
        String str = "History: \n";
        for (Object line : bankTransactions.toArray()) {
            str = str + line + "\n";
        }
        str = str + "Current Balance: $" + getBankBalance();

        return str;
    }

    public String toString(){
        // Construct and return a string representation of the student
        String str = "Name: " + name + "\n" +
                     "Bank Account ID: " + bankAccountID + "\n" +
                     "Current Balance: " + getBankBalance();
        return str;
    }

}