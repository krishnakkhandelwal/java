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

class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String msg) {
        super(msg);
    }
}

class BankSystem {

    Scanner sc = new Scanner(System.in);

    // Create Account
    void createAccount() {
        try {
            System.out.print("Enter Customer ID (1-20): ");
            int cid = sc.nextInt();

            if (cid < 1 || cid > 20)
                throw new InvalidCIDException("CID must be between 1 and 20");

            // Check duplicate CID
            File file = new File("bank.txt");
            if (file.exists()) {
                Scanner fileReader = new Scanner(file);

                while (fileReader.hasNext()) {
                    int existingCid = fileReader.nextInt();
                    fileReader.next(); // skip name
                    fileReader.nextDouble(); // skip amount

                    if (existingCid == cid) {
                        fileReader.close();
                        throw new InvalidCIDException("CID already exists!");
                    }
                }
                fileReader.close();
            }

            System.out.print("Enter Name: ");
            sc.nextLine(); // clear buffer
            String cname = sc.nextLine();

            System.out.print("Enter Initial Amount: ");
            double amount = sc.nextDouble();

            if (amount < 0)
                throw new NegativeAmountException("Amount must be positive");

            if (amount < 1000)
                throw new MinimumBalanceException("Minimum balance is Rs.1000");

            FileWriter fw = new FileWriter("bank.txt", true);
            fw.write(cid + " " + cname + " " + amount + "\n");
            fw.close();

            System.out.println("Account Created Successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Withdraw using CID
    void withdraw() {
        try {
            System.out.print("Enter Customer ID: ");
            int searchCid = sc.nextInt();

            System.out.print("Enter withdrawal amount: ");
            double wth = sc.nextDouble();

            if (wth < 0)
                throw new NegativeAmountException("Amount must be positive");

            File file = new File("bank.txt");
            File tempFile = new File("temp.txt");

            Scanner fileReader = new Scanner(file);
            FileWriter fw = new FileWriter(tempFile);

            boolean found = false;

            while (fileReader.hasNext()) {
                int cid = fileReader.nextInt();
                String cname = fileReader.next();
                double amount = fileReader.nextDouble();

                if (cid == searchCid) {
                    found = true;

                    if (wth > amount)
                        throw new InsufficientBalanceException("Insufficient Balance!");

                    amount -= wth;
                    System.out.println("Withdrawal Successful! New Balance: " + amount);
                }

                fw.write(cid + " " + cname + " " + amount + "\n");
            }

            fileReader.close();
            fw.close();

            if (!found) {
                tempFile.delete();
                throw new CustomerNotFoundException("Customer ID does not exist!");
            }

            // Replace old file
            file.delete();
            tempFile.renameTo(file);

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