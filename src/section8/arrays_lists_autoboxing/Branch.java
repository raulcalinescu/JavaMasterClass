package section8.arrays_lists_autoboxing;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {

    private String name;
    private static ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    // make methods boolean to also check/return for data validation when setting new items

    public boolean addNewCustomer (String newCustomer, Double initialTransaction) {
        if (findCustomer(newCustomer) == null) {
            this.customers.add(new Customer(newCustomer, initialTransaction));
            return true;
        }

        return false;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addTransactionFor (String existingCustomer, double transaction) {
        if(findCustomer(existingCustomer) != null) {
            Customer customer = new Customer(existingCustomer,transaction);
            customer.addTransaction(transaction);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i<this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }

        return null;
    }


    /*public static void listCustomers () {
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
    }*/
}
