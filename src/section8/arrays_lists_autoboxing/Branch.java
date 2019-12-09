package section8.arrays_lists_autoboxing;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void addNewCustomer (String newCustomer, Double initialTransaction) {
        Customer customer = new Customer (newCustomer,initialTransaction);
    }

    public static void addTransactionFor (Customer existingCustomer, Double transaction) {
        existingCustomer.addTransaction(transaction);
    }

    public static void listCustomers () {
        System.out.println("Would you like to see customers and their transactions? 0/1");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if (answer == 1) {
            System.out.println("Customers are: ");
            for (int i = 0; i < customers.size(); i++) {
                System.out.println(customers.get(i).getName());
                customers.get(i).getTransactions();
            }
        }
    }
}
