package section6.oop.part1;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNr;

    public BankAccount () {
        this("56789", 2.50, "Default name", "Default address",
                "default phone");

        System.out.println("Empty constr called");
    }

    public BankAccount (String number, double balance, String customerName, String customerEmail,
                        String customerPhoneNr) {
        System.out.println("BankAccount constr called with params");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNr = customerPhoneNr;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println(this.balance + "available. Can't withdrawal");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println(withdrawalAmount + "withdrawal. Remaining balance =" + this.balance);

        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
