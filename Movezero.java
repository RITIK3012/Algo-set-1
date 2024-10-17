public class Movezero {
    public static void moveZero(int arr[]) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
    public static void main(String args[]) {
        int arr[]={1,2,0,1,0,4,0};
        moveZero(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
