public class Twosum{
    public static int twoSum(int arr[], int target, int n){
        for(int i=0; i<n-1; i++){
            for(int j=n; j<n; j++){
                if(arr[0]+arr[1]==target){
                    return new int{1,2};
                }
                else{
                    return 0;
                }
            }
            
        }
        return new int{};
    }
    public static void main(String args[]){
        int arr[]={2,6,5,8,11};
        int target=14;
        int n= 5;
        int ans= twoSum(arr,target,n);
        System.out.print("The sum of two index is: " +ans);
    }
}