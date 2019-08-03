package section5.controlflow.statements;

public class PrimeNumbers {

    public static boolean isPrime (int n) {
        if(n == 1) return false;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }

        return true;
    }


    //print only the even numbers. NOTE i+=2 in for loop

    public static void printEven () {
        for (int i = 0; i < 100; i+=2) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        printEven();
        System.out.println(isPrime(34));
    }

}
