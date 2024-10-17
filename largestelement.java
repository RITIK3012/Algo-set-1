// import java.util.*;
// public class largestelement{
//     public static int largestEmt(int arr[]){
//         Arrays.sort(arr);
//         return arr[arr.length-1];
//     }
//     public static void main(String args[]){
//         int arr[]={2,5,1,3,0};
//         int largest = largestEmt(arr);
//         System.out.println("largest element of array" +largest);
        
//     }
// }

// Recursive method
import java.util.*;
public class largestelement{
    public static int printLargest(int arr[]){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
       int  arr[]={2,8,6,3,1};
       System.out.println("The largerst element is " +printLargest(arr)  );
       
    }
}