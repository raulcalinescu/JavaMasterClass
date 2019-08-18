package section5.controlflow.statements;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0, lastDigit, n = number;
        boolean negative = false;
        if (n <= 0) {
            n *= -1;
            negative = true;
        }

        while (n > 0) {
            lastDigit = n % 10;
            reverse *= 10;
            reverse += lastDigit;
            n = n /10;
        }
        if (negative)
            reverse *= -1;

        if (number == reverse)
            return true;
        else
            return false;
    }


   /*  Modular version /

    public static boolean isPalindrome(int number) {
        if (number == reverse(number))
            return true;
        else
            return false;
    }

    public static int reverse(int n) {
        int reverse = 0, lastDigit;
        boolean negative = false;
        if (n <= 0) {
            n *= -1;
            negative = true;
        }
        while (n > 0) {
            lastDigit = n % 10;
            reverse *= 10;
            reverse += lastDigit;
            n = n /10;
        }
        if (negative)
            return reverse * -1;
        else
            return reverse;
    }
    */

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }


}
