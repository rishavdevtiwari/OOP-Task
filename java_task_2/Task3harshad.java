//Write a method to determine whether a number is a Harshad number or 
//harshad -> a number which is divisible to the sum of its digits
import java.util.Scanner;
public class Task3harshad {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int divv=harshad(n);
        if(n%divv==0){
            System.out.print("The entered number is harshad");
        }else{
            System.out.print("The entered number isnt harshad");
        }
        sc.close();
    }
    public static int harshad(int n){
        int digisum=0;
        while(n!=0){
            digisum+=(n%10);
            n=n/10;
        }
        return digisum;
    }
}
