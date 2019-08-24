package section5.controlflow.statements;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0)
            return -1;
        else {
            int sum = 0, first = 0;
            int last = number % 10;

            while (number > 0) {
                first = number % 10;
                number /= 10;
            }

            sum = last + first;
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

}
