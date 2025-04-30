//Write a method to swap two numbers without using a temporary variable
import java.util.Scanner;
public class Task9swapwouttemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        swap(a,b);
        sc.close();
    }
    public static void swap(int a, int b){
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.print("swapper val: "+a+" and "+b);
    }
}
