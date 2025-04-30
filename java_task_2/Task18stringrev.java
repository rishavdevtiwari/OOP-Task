//Create a method to reverse an integer number without converting it to a string
import java.util.Scanner;

public class Task18stringrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt();
        strrev(n);
        sc.close();
    }
    public static void strrev(int n){
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
