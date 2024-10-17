import java.util.Scanner;

public class Maxelement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("The first element is: ");
        int num1 = sc.nextInt();
        System.out.println("The Second element is ");
        int num2 = sc.nextInt();
        System.out.println("The third element is: ");
        int num3 = sc.nextInt();
        System.out.println("The fouth element is ");
        int num4 = sc.nextInt();
        System.out.println("The fifth element is ");
        int num5 = sc.nextInt();

        // int maxNum = num1; 

        // if(num2 > maxNum){
        //     maxNum=num2;
        // }
        // if(num3> maxNum){
        //     maxNum= num3;
        // }
        // if(num4>maxNum){
        //     maxNum=num4;
        // }
        // if(num5>maxNum){
        //     maxNum=num5;
        // }

        int maxNum = Math.max(Math.max(Math.max(Math.max(num1,num2),num3),num4),num5);

        System.out.println("The maximum of all the numbers is: " +maxNum);
    }
}