//Write a method to calculate the compound interest given principal, rate, and time

import java.util.Scanner;

public class Task6ptr {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principle : ");
        int a=sc.nextInt();
        System.out.print("Enter rate :");
        int b=sc.nextInt();
        System.out.print("Enter time : ");
        int c=sc.nextInt();
        si(a,b,c);
        sc.close();
    }
    public static void si(int a,int b,int c){
        int mul=(a*b*c)/100;
        System.out.print("The simple interest is  : "+mul);
    }
}
