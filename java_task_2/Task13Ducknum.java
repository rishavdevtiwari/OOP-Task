//Write a method to determine if a number is a Duck number
import java.util.Scanner;
public class Task13Ducknum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        duck(n);
        sc.close();
    }
public static void duck(int n){
int t=n;
int c=0;
while(t!=0){
    t=t/10;
    c++;
}
int count0=0;

for(int i=c;i>0;i--){
    if(n%10==0){
        if(i!=0){
            count0++;
        }else{

        }
    }else{

    }
    n=n/10;
}
if(count0>0){
    System.out.println("Duck Number");
}else{
System.out.println("not duck number");
}
}
}


    

