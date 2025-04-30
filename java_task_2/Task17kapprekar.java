//Write a method to check if a number is a Kaprekar number
import java.util.Scanner;
public class Task17kapprekar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        if (n<=0){
            System.out.println("Not a kaprekar number");
        }else{
            kaprekar(n);
        }
        sc.close();
    }
    public static void kaprekar(int n){
        int squaredn=n*n;
        // System.out.println(squaredn+"squared val");
        int calcdigi=squaredn;
        int digi=0;
        while(calcdigi!=0){
            calcdigi=calcdigi/10;
            digi++;
        }
        int halfval=digi/2;
        // System.out.println(halfval+ "halfval");
        int secondhalfcalculator=10;
        for (int i = 1; i < halfval; i++) {
            secondhalfcalculator *= 10;
        } //if half value is 3, gives 1000 so we obtain last ko 3 digits
        // System.out.println(secondhalfcalculator+" secondhalfcalc");
        int secondhalf=squaredn%secondhalfcalculator; //returns 456 if number is 123456 and secondhalfcalculator is 1000
        int firsthalf=squaredn/secondhalfcalculator; // returns 123 if number is 123456 and secondhalfcalculator is 1000
        int sum=firsthalf+secondhalf;
        if(sum==n){
            System.out.println(n+" is a kapprekar number");
        }else{
            System.out.println(n+" is not a kapprekar number");
        }
    }
}
