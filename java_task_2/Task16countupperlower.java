//Create a method to count uppercase and lowercase characters in a string
import java.util.Scanner;

public class Task16countupperlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        countCase(input);
        sc.close();
    }

    public static void countCase(String str) {
        int upper = 0, lower = 0;
        for (int i=0;i<str.length();i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                lower++;
            }
        }
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
    }
}
