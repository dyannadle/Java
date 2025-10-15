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

import java.util.Scanner;
public class chapter5_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(2*i);
        }
    }
}


