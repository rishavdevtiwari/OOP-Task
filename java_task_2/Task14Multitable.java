//Create a method to print the multiplication tables from 1 to 10
public class Task14Multitable {
    public static void main(String[] args) {
     for(int i=1;i<=10;i++){
        multi(i);
     }   
    }
    public static void multi(int n){
        System.out.println("Multiplication table of "+n);
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
