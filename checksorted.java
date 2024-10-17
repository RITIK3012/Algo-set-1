public class checksorted{
    public static boolean checkSorted(int arr[], int n){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]< arr[i])
                    return false;
                }
            }
            return true;
        
    }
    public static void main(String args[]){
        int n=5;
        int arr[]= {1,2,3,4,5};
        System.out.println(checkSorted(arr,n));

    }
}