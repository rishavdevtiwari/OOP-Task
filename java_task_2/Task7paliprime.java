import java.util.Scanner;
public class Task7paliprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n=sc.nextInt();
        int checkprime=prime(n);
        if(checkprime==1){
            pali(n);
        }else{
            System.out.print("The number is not prime");
        }
        sc.close();
    }
    public static int prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }else{

            }
        }
        if(c>2){
            return 0;
        }else{
            return 1;
        }
    }
    public static void pali(int n){
        int rev=0;
        int origi=n;
        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        if(rev==origi){
            System.out.print("The entered nmber is palindrome prime");
        }else{
            System.out.print("The entered number is not palindrome prime");
        }
    }
}
