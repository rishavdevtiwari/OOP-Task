//Write a method to swap two numbers using a temporary variable
import java.util.Scanner;
public class Task8swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first num : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        swap(a,b);
        sc.close();
    }
    public static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.print("The values are "+a+" and "+b);
    }
}
