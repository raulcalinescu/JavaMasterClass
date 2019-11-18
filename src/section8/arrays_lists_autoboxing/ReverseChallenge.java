package section8.arrays_lists_autoboxing;

import java.util.Arrays;

public class ReverseChallenge {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < arr.length; i++)
            System.out.print(" "+ arr[i]);
        reverse(arr);

        System.out.println("\n Reversed array is " + Arrays.toString(arr));
    }

    private static void reverse(int[] array) {
        int length = array.length;
        if(length > 0) {
            int temp;
            for(int i = 0; i < length; i++,length--) {      // traverse the array with two synchronously incrementing/
                                                            // decrementing pointers and swapping their values.
                                                                // When left is greater or equal
                                                                // to the right we got our array reversed
                temp = array[i];
                array[i] = array[length-1];
                array[length-1] = temp;
            }
        }
    }

    // you can also do this by going to the half length of the array.  i < (array.length / 2)

    private static void reverseTim(int[] array) {
        int maxIndex = array.length - 1;
        if(array.length > 0) {
            int temp;
            for(int i = 0; i < array.length/2; i++) {
                temp = array[i];
                array[i] = array[maxIndex - i];
                array[maxIndex - i] = temp;
            }
        }
    }
}
