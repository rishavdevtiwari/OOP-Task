//Create a method that accepts a character and returns its ASCII value
import java.util.Scanner;
public class Task20ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a char : ");
        char n=sc.next().charAt(0);
        int asciival=ascii(n);
        System.out.println("Ascii val for "+n+" Is "+asciival);
        sc.close();
    }
    public static int ascii(int n){
        return (int) n;
    }
}
