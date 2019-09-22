package section6_7.oop.constructors_inheritance;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("carrera");
        System.out.println("model is" + porsche.getModel());

        porsche.setModel("comodore");
        System.out.println("model is" + porsche.getModel());


        ///

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100);

        ////


    }
}
