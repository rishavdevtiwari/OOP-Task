//Create a method to convert a given number of days into years, months, and days
import java.util.Scanner;

public class Task2dayconvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of days : ");
        int d=sc.nextInt();
        convert(d);
        sc.close();
    }
    public static void convert(int n){
        int y=0; int m=0; int d=0;
        while(n!=0){
            if(n>365){
                y=n/365;
                n=n%(y*365);
            }else if(n>30){
                m=n/30;
                n=n%(m*30);
            }else{
                d=n;
                n=n-d;
            }
        }
        System.out.println("Years: "+y+" Months: "+m+" days: "+d);
    }
}
