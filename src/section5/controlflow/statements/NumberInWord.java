package section5.controlflow.statements;

/*
one parameter number- whole number
prints 0, 1, etc... or other for any other numbers including negatives.
 */

public class NumberInWord {

    public static void printNumberInWord (int number) {
        switch (number) {
            case 0: System.out.println("ZERO");
                    break;
            case 1: System.out.println("ONE");
                break;
            case 2: System.out.println("TWO");
                break;
            case 3: System.out.println("THREE");
                break;
            case 4: System.out.println("FOUR");
                break;
            case 5: System.out.println("FIVE");
                break;
            case 6: System.out.println("SIX");
                break;
            case 7: System.out.println("SEVEN");
                break;
            case 8: System.out.println("EIGHT");
                break;
            case 9: System.out.println("NINE");
                break;
            default: System.out.println("other");
                break; // don't really need a break here after last condition there is no other case to fall down tO

        }
    }


}
