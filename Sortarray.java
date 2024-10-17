import java.util.*;

public class Sortarray {
    public static void sortArray(ArrayList<Integer> arr) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        // count the numbers 0's, 1's, and 2's
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                count1++;
            } else if (arr.get(i) == 1) {
                count2++;
            } else {
                count3++;
            }
        }

        // replace the place in original array:
        int index = 0;
        for (int i = 0; i < count1; i++) {
            arr.set(index++, 0); // replacement of 0's
        }
        for (int i = 0; i < count2; i++) {
            arr.set(index++, 1); // replacement of 1's
        }
        for (int i = 0; i < count3; i++) {
            arr.set(index++, 2); // replacement of 2's
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr);
        System.out.println("After sorting:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}