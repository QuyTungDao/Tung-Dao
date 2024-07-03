package java_16_5_2024;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Infor users[] = new Infor[2];
        users[0] = new Infor("001", "Tung", "0123456", 5000000);
        users[1] = new Infor("002", "Dao", "12345", 1000000);

        boolean flag = true;
        Infor currentUser = null;
        while (flag) {
            System.out.println("Enter your ID: ");
            String id = sc.nextLine();
            System.out.println("Enter your password: ");
            String password = sc.nextLine();

            for (Infor user : users) {
                if (user.getId().equals(id) && user.getPassword().equals(password)) {
                    System.out.println("Login Successfully!!!");
                    flag = false;
                    currentUser = user;
                    break;
                }
            }

            if (currentUser == null) {
                System.out.println("Invalid ID or Password.Please try again");
            }
        }

        System.out.println("Welcome to the ATM "+ currentUser.getName());

        boolean exit = true;
        while (exit) {
            System.out.println("Choose an option: ");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check account balance");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    boolean amount_valid = true;
                    while (amount_valid) {
                        try {
                            System.out.println("Enter amount to withdraw: ");
                            double amount = sc.nextDouble();

                            if (amount > currentUser.getBalance()) {
                                System.out.println("Insufficient Balance");
                            } else {
                                currentUser.setBalance(currentUser.getBalance() - amount);
                                System.out.println("Withdraw Successfully!!!, New balance: " + currentUser.getBalance());
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid amount");
                            sc.next();
                        }
                        break;
                    }
                case 2:
                    System.out.println("Account balance: " + currentUser.getBalance());
                    break;

                case 3:
                    exit = false;
                    System.out.println("Thank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again");
                    break;
            }
        }
    }
}
