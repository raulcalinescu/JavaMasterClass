package section8.arrays_lists_autoboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private static ArrayList<Branch> branches;

    public void addNewBranch(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public void showCustomers(Branch branch) {
        branch.listCustomers();
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addNewCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addTransactionFor(customerName, amount);
        }
        return false;
    }

    private

    public static void main(String[] args) {

    }
}
