//Create a method to find the sum of the first n natural numbers
import java.util.Scanner;
public class Task10sumofnaturalnum {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the nth term");
int n=sc.nextInt();
sumton(n);
sc.close();
}
public static void sumton(int n){
    int sum=0;
for (int i=0;i<=n;i++){
sum=sum+i;
}
System.out.println("The sum to nth term is : "+sum);
}
}
