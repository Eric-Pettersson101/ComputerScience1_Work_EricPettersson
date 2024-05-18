package mypack;
import java.io.*;
import java.util.*;

public class Eric_Pettersson_AssignmentFive {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500, 0.005);
        try {
            // Read the deposit amounts from Deposits.txt and add them to the account balance
            Scanner depositScanner = new Scanner(new File("Deposits.txt"));
            while (depositScanner.hasNextDouble()) {
                account.deposit(depositScanner.nextDouble());
            }
            
            
            // Read the withdrawal amounts from Withdrawals.txt and subtract them from the account balance
            Scanner withdrawalScanner = new Scanner(new File("Withdrawals.txt"));
            while (withdrawalScanner.hasNextDouble()) {
                account.withdraw(withdrawalScanner.nextDouble());
            }

            // Calculate the monthly interest
            account.addInterest();

            // Display the ending balance and the total interest earned
            System.out.printf("Ending balance: $%.2f%n", account.getBalance());
            System.out.printf("Total interest earned: $%.2f%n", account.getLastInterest());
            
            // Closing both scanner instances to prevent memory leakage
            depositScanner.close();
            withdrawalScanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while trying to read the files.");
            e.printStackTrace();
        }
    }
}
