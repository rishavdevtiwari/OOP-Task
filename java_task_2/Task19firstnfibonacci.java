//Write a method to generate the first n terms of the Fibonacci series
import java.util.Scanner;

public class Task19firstnfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n = sc.nextInt();
        fibo(n);
        sc.close();
    }

    public static void fibo(int n) {
        int a = 0, b = 1, c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < (n-2); i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}

