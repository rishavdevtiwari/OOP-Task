//Create a method to calculate the cube of a given number
import java.util.Scanner;
public class Task12cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        cube(n);
        sc.close();
    }
public static void cube(int n){
    System.out.print("The cubed val is : "+n*n*n);
}
}