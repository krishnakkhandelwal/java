import java.io.*;
import java.util.*;

// Custom Exceptions
class InvalidCIDException extends Exception {
    public InvalidCIDException(String msg) {
        super(msg);
    }
}

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) {
        super(msg);
    }
}

class BankSystem {
    int cid;
    String cname;
    double amount;

    Scanner sc = new Scanner(System.in);

    void createAccount() {
        try {
            System.out.print("Enter Customer ID (1-20): ");
            cid = sc.nextInt();

            if (cid < 1 || cid > 20)
                throw new InvalidCIDException("CID must be between 1 and 20");

            System.out.print("Enter Name: ");
            cname = sc.next();

            System.out.print("Enter Initial Amount: ");
            amount = sc.nextDouble();

            if (amount < 0)
                throw new NegativeAmountException("Amount must be positive");

            if (amount < 1000)
                throw new MinimumBalanceException("Minimum balance is Rs.1000");

            // Writing to file
            FileWriter fw = new FileWriter("bank.txt", true);
            fw.write(cid + " " + cname + " " + amount + "\n");
            fw.close();

            System.out.println("Account Created Successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void withdraw() {
        try {
            System.out.print("Enter withdrawal amount: ");
            double wth = sc.nextDouble();

            if (wth < 0)
                throw new NegativeAmountException("Amount must be positive");

            if (wth > amount)
                throw new InsufficientBalanceException("Insufficient Balance!");

            amount -= wth;
            System.out.println("Withdrawal Successful! Remaining Balance: " + amount);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankSystem b = new BankSystem();
        int choice;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    b.createAccount();
                    break;
                case 2:
                    b.withdraw();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }
}