// Write a method to count the number of words in a given string
import java.util.Scanner;

public class Task4strdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String n = sc.nextLine();
        countwords(n);
        sc.close();
    }

    public static void countwords(String n) {
        int count = 0;

        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)!=' '){
                count++;
            }else{
                
            }
        }
        System.out.println("The number of words is: " + count);
}
}
