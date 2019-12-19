package section8.arrays_lists_autoboxing;

public class Main_BankApp {

    public static void main(String[] args) {
        Bank bank = new Bank("National Romanian Bank");

        bank.addBranch("Oradea");

        bank.addCustomer("Oradea", "Raul", 100.05);
        bank.addCustomer("Oradea", "Mike", 175.05);
        bank.addCustomer("Oradea", "Percy", 101.05);

        bank.addBranch("Cluj");
        //bank.addCustomer("Cluj","Bob", 150.54);

        bank.addCustomerTransaction("Oradea", "Raul", 44.42);
        bank.addCustomerTransaction("Oradea", "Mike", 14.42);

        bank.listCustomers("Oradea", true);
        //bank.listCustomers("Cluj", true);

    }
}
