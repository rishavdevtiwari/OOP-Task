//Write a method to print all factors of a number
import java.util.Scanner;
public class Task11allfactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        fact(n);
        sc.close();
    }
    public static void fact(int n){
        System.out.println("The factors of the number are : ");
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }else{

            }
        }
    }
}
