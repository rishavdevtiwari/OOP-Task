//Write a method to print all odd numbers from 1 to a given number n
import java.util.Scanner;
public class Task1oddtonth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nth term ");
        int n=sc.nextInt();
        odd(n);
        sc.close();
    }
    public static void odd(int n){
        for(int i=1;i<=n;i++){
            if(i%2==0){

            }else{
                System.out.print(i);
            }
        }
    }
}