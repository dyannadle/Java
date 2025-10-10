
import java.util.Scanner;

public class cwh_18_elseif {
public static void main(String[] args) {
    int age;
    System.out.println("Enter Your Age");
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();
    if (age > 60) {
        System.out.println("You are experienced!");
    }
    else if (age > 45) {
        System.out.println("You are semi-experienced!");
    }
    else if (age > 35) {
        System.out.println("You are semi-semi-experienced!");
    }
    else {
        System.out.println("You are not experienced");
    }
}
