package section8.arrays_lists_autoboxing;

import java.util.ArrayList;

public class Branch {
    private static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void addNewCustomer (String newCustomer, Double initialTransaction) {
        Customer customer = new Customer (newCustomer,initialTransaction);
    }

    public static void addTransactionFor (Customer existingCustomer, Double transaction) {
        existingCustomer.addTransaction(transaction);
    }
}
