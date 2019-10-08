package section8.arrays_lists_autoboxing;

import java.util.Scanner;

public class ArraySorting {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }


    public static int[] getIntegers(int capacity) {
        int[] a = new int[capacity];
        System.out.println("Enter " + capacity +" integer values:\r");
        for(int i=0; i<a.length; i++) {
            a[i] = scanner.nextInt();
        }
        return a;
    }

    public static int[] sortIntegers(int[] a) {
        int[] sorted = new int[a.length];         // creating an array that is same value as what is passed to us
        for(int i = 0; i < a.length; i++) {
            sorted[i] = a[i];
        }

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;                           // sort while there is at least one remaining swap left

            for(int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i+1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;                    // every time we do a swap, raise flag to iterate again.
                }
            }
        }

        return sorted;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("element " + i + " contents " + a[i]);
        }
    }
}
