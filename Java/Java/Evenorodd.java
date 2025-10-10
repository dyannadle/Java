import java.util.Scanner;

public class Evenorodd{
    public static void main(String []args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
System.out.println("Enter a number:");
if (num % 2==0){
    System.out.println("The number is even");
}
else{
    System.out.println("The number is odd");
}
    
    }
}