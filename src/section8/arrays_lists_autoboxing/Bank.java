package section8.arrays_lists_autoboxing;

import java.util.ArrayList;

public class Bank {
    private static ArrayList<Branch> branches = new ArrayList<Branch>();

    public static void addNewBranch(Branch branch) {
        branches.add(branch);
    }

    public static void addTransaction(Branch branch, Double transaction, Customer customer) {
        branch.addTransactionFor(customer,transaction);
    }

    public static void showCustomers(Branch branch) {
        branch.listCustomers();
    }

    public static void main(String[] args) {

    }
}
