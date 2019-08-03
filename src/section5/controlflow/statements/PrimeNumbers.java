package section5.controlflow.statements;

public class PrimeNumbers {

    public static boolean isPrime (int n) {
        if(n == 1) return false;

        for(int i = 0; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }

        return true;
    }
}
