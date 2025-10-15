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
// import java.util.Scanner;
// public class chapter5_1 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");// prompt user for input
//         int n= sc.nextInt();// input number
    
//             for(int i=1; i<=10; i++){ // loop from 1 to 10
//         System.out.printf("%d X %d = %d\n", n, i, n*i); // print multiplication table
//         }
//     }
// }



//write a program to print factorial of a given number using for loop
// import java.util.Scanner;
// public class chapter5_1 {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n=5;
//         int i=1;
//         int factorial=1;
//         while(i<=n){
//             factorial=factorial*i;
//             i++;
//         }
//         System.out.println("The factorial of a given number is :" + factorial);
//     }
// }




//REPEAT 5 USING WHILE LOOP
 
// import java.util.Scanner;
// public class chapter5_1 {   
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n=5;
//         int i=1;
//         while(i<=n){
//             System.out.println(i);
//             i++;
//         }
//     }
// }   



//REPEAT 5 USING DO WHILE LOOP
// import java.util.Scanner;   
// public class chapter5_1 {   
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int n=5;
//         int i=1;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<=n);
//     }
// }


//repeat 1 to n using for/ while loop
    // import java.util.Scanner;
    // public class chapter5_1 {   
    //     public static void main(String[]args){
    //         Scanner sc = new Scanner(System.in);
    //         System.out.println("Enter a number :");
    //         int n= sc.nextInt();
    //         for(int i=1; i<=n; i++){
    //             System.out.println(i);
    //         }
    //     }
    // }




//what can be done using one type of loop can also be done using other two types of loop- true or false
    // import java.util.Scanner;
    // public class chapter5_1 {   
    //     public static void main(String[]args){
    //         Scanner sc = new Scanner(System.in);
    //         int n=5;
    //         int i=1;
    //         while(i<=n){
    //             System.out.println(i);
    //             i++;
    //         }
    //     }
    // }




    //write a program to calculate sum of multiplication table of a given number
//     import java.util.Scanner;
//      public class chapter5_1 {   
//          public static void main(String[]args){
//     int n=8;
//     int sum=0;
//     for(int  i=1; i<=10; i++){
//         sum+=n*i;

//     }
//     System.out.println("The sum of multiplication table is :" + sum);
// }
// }




//a do while loop is executed :
//at least once
//at least twice
//atmost once
//zero or more times
//once or more times

import java.util.Scanner;
    public class chapter5_1 {   
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int n=5;
            int i=1;
            do{
                System.out.println(i);
                i++;
            }while(i<=n);
        }
    }