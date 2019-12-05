package section5.controlflow.statements;

import java.util.Scanner;

public class Retire_Investment {

    public static double sum = 0;
    public static int years = 0;

    public static void main(String[] args) {
        System.out.println("Enter the sum of money you'd like to start the investment with: ");
        Scanner sc = new Scanner(System.in);
        sum = sc.nextInt();
        System.out.println("Enter the amount you'd like to invest monthly: ");
        int monthlyAdd = sc.nextInt();
        System.out.println("Enter how many years you'd like to invest monthly: ");
        years = sc.nextInt();

        System.out.println("With a starting sum of $" + sum + ": \n");

        for(int i = 1; i <= 40; i++) {
            if (i <= years)
                sum = (monthlyAdd * 12) + sum + sum * 0.1;
            else
                sum = sum + sum * 0.1;
            System.out.println("After " + i + " years you'll have $" + sum + ", with $" + (sum * 0.1) + " from compound " +
                    "interest from previous year.\n");
        }
    }
}
