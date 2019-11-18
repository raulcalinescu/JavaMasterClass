package section8.arrays_lists_autoboxing;

import java.util.Scanner;

public class MinElemChallenge {

    private static Scanner scanner = new Scanner(System.in);       // private so no other classes in the pkg can access

    public static void main(String[] args) {
        System.out.println("Enter the count of integers to be added into the array! \n");

        int count = scanner.nextInt();
        scanner.nextLine();                    // follow with this statement to process the 'Enter' key
        int[] arr = readIntegers(count);
        int min = findMin(arr);
        System.out.println("The minimum number in the array is " + min);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        while (count > 0) {      //if using a for loop you use another address in memory for index and no need for that
            System.out.println("Enter a value to be added to the array: \n");
            array[count-1] = scanner.nextInt();
            scanner.nextLine();
            count--;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

}
