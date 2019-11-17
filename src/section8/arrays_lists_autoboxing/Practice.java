package section8.arrays_lists_autoboxing;

public class Practice {




    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        int[] myNumbers = {1,2,3,4,5};
        myIntArray[5] = 50;

        for (int i = 0; i < 10; i++) {
            System.out.print(myIntArray[i] + " ");
        }
        myNumbers[2] = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(myNumbers[i]);
        }

    }
}
