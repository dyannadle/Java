// write a progaram to print following pattern
//*****
//****
//***
//**
//*



// public class chapter5_1 {
//  public static void main(String[] args) {
//      int n=4;
//      for (int i=n; i>0; i--){
//          for(int j=0; j<i; j++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }
//  }   
// }





//write a program to print first n even numbers

// import java.util.Scanner;
// public class chapter5_1 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         int n= sc.nextInt();
//         for(int i=1; i<=n; i++){
//             System.out.println(2*i);
//         }
//     }
// }

//WRITE A PROGRAM TO PRINT SUM OF EVEN NUMBERS
// import java.util.Scanner;
// public class chapter5_1 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         int n= sc.nextInt();
//         int sum=0;
//         for(int i=1; i<=n; i++){
//             if(i%2==0){
//                 sum=sum+i;
//             }
//         }
//         System.out.println("The sum of even numbers is :" + sum);
//     }
// }

//write a program to print first n odd numbers

// import java.util.Scanner;
// public class chapter5_1 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         int n= sc.nextInt();
//         for(int i=0; i<n; i++){
//             System.out.println(2*i+1);
//         }
//     }
// }


//write a program to print sum of odd numbers
// import java.util.Scanner;    
// public class chapter5_1 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         int n= sc.nextInt();
//         int sum=0;
//         for(int i=1; i<=n; i++){
//             if(i%2!=0){
//                 sum=sum+i;
//             }
//         }
//         System.out.println("The sum of odd numbers is :" + sum);
//     }
// }

// write a program to print first n natural numbers in reverse order
// import java.util.Scanner;
// public class chapter5_1 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         int n= sc.nextInt();
//         for(int i=n; i>0; i--){
//             System.out.println(i);
//         }
//     }
// }


//write a progaram to print multiplication table of a given number
import java.util.Scanner;
public class chapter5_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");// prompt user for input
        int n= sc.nextInt();// input number
        System.out.println("Multiplication table of " + n + " is :");
        for(int i=1; i<=10; i++){// loop from 1 to 10
            System.out.println(n + " * " + i + " = " + (n*i));// print n*i
        }
    }
}