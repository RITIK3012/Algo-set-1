// import java.util.*;
// public class Secondlargestelement {
//     public static int secondLargest(int arr[]){
//         Arrays.sort(arr);
//         return arr[arr.length-2];

//     }
//     public static void main(String args[]){
//         int arr[]={2,6,3,1,5};
//         int element=secondLargest(arr);
//         System.out.println("second largest element element : " + element);
        
//     }
    
// }
//without sorting the element
public class Secondlargestelement{
    public static int getElement(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest =arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
            System.out.println("The second largest element is :" +largest);
            System.out.println("The second largest element is :" +smallest);
        }
    }

    public static void main(String args[]){
        int arr[]= {2,5,3,8,10};
        getElement(arr);
        


    }
}
