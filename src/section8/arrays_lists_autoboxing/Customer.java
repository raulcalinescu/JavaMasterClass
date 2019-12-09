package section8.arrays_lists_autoboxing;

import java.util.ArrayList;

public class Customer {

    private static String name;
    private static ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        transactions.add(transaction);
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Customer.name = name;
    }

    public static void getTransactions() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }

    public static void setTransactions(ArrayList<Double> transactions) {
        Customer.transactions = transactions;
    }

    public static void addTransaction(double transaction) {
        transactions.add(transaction);
    }

}
