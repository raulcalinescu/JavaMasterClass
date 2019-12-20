package section8.arrays_lists_autoboxing;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
            return this.transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

}
