//Write a method that returns the sum of squares of digits of a number
import java.util.Scanner;
public class Task15digitsquaresum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int sum=squaredsum(n);
        System.out.println("The sum of the digits is : "+sum);
        sc.close();
    }
    public static int squaredsum(int n){
        int summ=0;
        while(n!=0){
            summ=summ+((n%10)*(n%10));
            n=n/10;
        }

        return summ;
    }
}
