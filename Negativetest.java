public class Negativetest{
    public static int negativeCheck(int arr[]){
        int negativcount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                negativcount++;
            }
            
        }
        System.out.println("total no. of negative number ="+negativcount);
        return negativcount;
    }
    public static void main(String args[]){
        int arr[]= {-1,-2,6,0,-4,-8,-3,4};
        negativeCheck(arr);
    }
}