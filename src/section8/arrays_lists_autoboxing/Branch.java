package section8.arrays_lists_autoboxing;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {

    private String name;
    private static ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }


    // make methods boolean to also check/return for data validation when setting new items

    public static boolean addNewCustomer (String newCustomer, Double initialTransaction) {
        if (findCustomer(newCustomer)) {
            return false;
        }
        Customer customer = new Customer (newCustomer,initialTransaction);
        customers.add(customer);
        return true;
    }

    public static void addTransactionFor (Customer existingCustomer, Double transaction) {
        existingCustomer.addTransaction(transaction);
    }

    public static boolean findCustomer(String customer) {
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(customer)){
                return true;
            }
        }
        return false;
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
