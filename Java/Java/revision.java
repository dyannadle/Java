
// Write a Java program to print “Hello, Java World!” on the console.


// public class revision {

//     public static void main(String[] args) {
//         System.out.println("Hello, Java world!");
//         }
//    }
    

//Write a program to print your name, age, and city using three System.out.println() statements.

// public class revision {
//     public static void main(String[] args) {
//        String name= "Deepak";
//        int age =24;
//        String city = "New Delhi";
//         System.out.println(name + " is " + age+ " years old and he  lives in " + city);
//         }
//    }


// Write a program that demonstrates data types: declare variables of all primitive types and print their values.


// public class revision {
//     public static void main(String[] args) {
//        String name= "Deepak";
//        int age =24;
//        String city = "New Delhi";
//     double marks =94.5;
//     boolean isBoy = true;
//     float cgpa = 8.9f;
//        System.out.println("Name: " + name + "\nAge: " + age+ "\nCity: " + city + "\nmarks : " + marks  + "\nIs Boy: " + isBoy + "\nCGPA: " + cgpa);    
//         }
//    }


//Write a program to add two integers entered by the user using Scanner.

// import java.util.Scanner;
// public class revision {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//          System.out.print("The Sum of 2 numbers is: ");
//         int a = sc.nextInt();
//         System.out.print(" Enter number two : ");
//         int b = sc.nextInt();
//         System.out.print(" Sum of two number is : ");
//        System.out.println(a + b); 
//         }
//    }



//Write a Java program to calculate the area of a circle using the formula area = π * r * r.


// import java.util.Scanner;
// public class revision {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//          System.out.print(" Enter radius of circle: ");
//         double r = sc.nextDouble(); 
//         double area = Math.PI * r * r;
//         System.out.print(" Area of circle is : ");  
//          System.out.println(area);    
//           }
//     }


// Write a program to demonstrate implicit and explicit type casting between int, float, and double.

// public class revision {
//     public static void main(String[] args) {
//      int marks = 10;
//      double mdouble = marks;   
//         System.out.print(mdouble);   
//           }
//     }


// public class revision {
//     public static void main(String[] args) {
//     double price = 45.67;
//      int iprice = (int) price;   
//      System.out.print(iprice);   
//           }
//     }



// This program demonstrates the rules of type casting (implicit and explicit) between the integer (int) and floating-point types (float, double) in Java.

// public class revision {

//     public static void main(String[] args) {

//         System.out.println("--- 1. IMPLICIT CASTING (Widening Conversion) ---");
//         // Implicit casting is automatic and safe (no data loss).
//         // It moves from smaller types (e.g., int) to larger types (e.g., double).

//         int myInt = 100; // 32-bit integer
//         float myFloat = 1000.5f; // 32-bit floating point

//         // 1.1. int to float (Implicit)
//         // int is smaller than float, so the conversion is automatic and safe.
//         float floatFromInt = myInt; 
//         System.out.println("int (" + myInt + ") -> float: " + floatFromInt); // Output: 100.0

//         // 1.2. float to double (Implicit)
//         // float is smaller than double, so the conversion is automatic and safe.
//         double doubleFromFloat = myFloat;
//         System.out.println("float (" + myFloat + ") -> double: " + doubleFromFloat); // Output: 1000.5

//         // 1.3. int to double (Implicit)
//         // int is smaller than double, so the conversion is automatic and safe.
//         double doubleFromInt = myInt;
//         System.out.println("int (" + myInt + ") -> double: " + doubleFromInt); // Output: 100.0

//         System.out.println("\n--- 2. EXPLICIT CASTING (Narrowing Conversion) ---");
//         // Explicit casting requires the programmer to use (type) because it is unsafe
//         // and may result in data or precision loss (truncation).

//         double myDouble = 45.678; // 64-bit floating point
//         float largeFloat = 500.99f; // 32-bit floating point

//         // 2.1. double to float (Explicit)
//         // double is larger than float. Loss of precision is possible (Explicit cast required).
//         float floatFromDouble = (float) myDouble;
//         System.out.println("double (" + myDouble + ") -> float: " + floatFromDouble);

//         // 2.2. float to int (Explicit)
//         // float is larger than int. The decimal part is TRUNCATED (data loss).
//         int intFromFloat = (int) largeFloat;
//         System.out.println("float (" + largeFloat + ") -> int: " + intFromFloat); // Output: 500

//         // 2.3. double to int (Explicit)
//         // double is much larger than int. Both decimal loss and truncation occur.
//         int intFromDouble = (int) myDouble;
//         System.out.println("double (" + myDouble + ") -> int: " + intFromDouble); // Output: 45
//     }
// }




//Write a program that swaps two variables without using a third variable.
//  public class revision {
//      public static void main(String[] args) { 
//         int a=10;
//         int b=20;
//         System.out.println("Before Swapping: a= " + a + " b= " + b);
//         a = a + b;//30
//         b= a-b;//10
//         a= a - b;//20
//         System.out.println("After Swapping: a= " + a + " b= " + b);  
//           } 
//     }


//Write a program that accepts marks of a student and prints whether they passed or failed (pass >= 40).
// import java.util.Scanner;
// public class revision {
//     public static void main(String[] args) { 
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter marks of student: ");
//        int marks = sc.nextInt();
//        if(marks >= 40){
//         System.out.println(" Student has Passed ");
//        }
//        else{
//    System.out.println(" Student has Failed ");
//        }  
//          } 
//     }





//10. Write a program to find whether a number is even or odd using the modulus operator.
// import java.util.Scanner;
// public class revision {
//     public static void main(String[] args) { 
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a number: ");
//        int num = sc.nextInt();
//        if(num % 2 == 0){
//         System.out.println(" The number is Even ");
//        }
//        else{
//    System.out.println(" The number is Odd ");
//        }  
//          } 
//     }




//Write a program to demonstrate all arithmetic operators on two integers.
// import java.util.Scanner;
// public class revision { 
//     public static void main(String[] args) { 
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter first number: ");
//        int a = sc.nextInt();
//        System.out.print(" Enter second number: ");
//        int b = sc.nextInt();

//        System.out.println(" Addition: " + (a + b));
//        System.out.println(" Subtraction: " + (a - b));
//        System.out.println(" Multiplication: " + (a * b));
//        System.out.println(" Division: " + (a / b));
//        System.out.println(" Modulus: " + (a % b));  
//          } 
//      }



//Write a program that takes input as a character and prints its ASCII value. 
// import java.util.Scanner;
// public class revision {
//     public static void main(String[] args) { 
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a character: ");
//        char ch = sc.next().charAt(0);
//        int asciiValue = (int) ch;
//        System.out.println(" ASCII value of " + ch + " is: " + asciiValue);  
//          } 
//      }
     


     //Write a program to check whether a given year is a leap year or not.
    //  import java.util.Scanner;
    //  public class revision {    
    //         public static void main(String[] args) { 
    //         Scanner sc = new Scanner(System.in);
    //         System.out.print(" Enter a year: ");
    //         int year = sc.nextInt();
    //         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    //             System.out.println(year + " is a leap year.");
    //         } else {
    //             System.out.println(year + " is not a leap year.");
    //         }  
    //         } 
    //     }



        //Write a program to convert Celsius to Fahrenheit.
        // import java.util.Scanner;
        // public class revision {    
        //         public static void main(String[] args) { 
        //         Scanner sc = new Scanner(System.in);
        //         System.out.print(" Enter temperature in Celsius: ");
        //         double celsius = sc.nextDouble();
        //         double fahrenheit = (celsius * 9/5) + 32;
        //         System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        //         } 
        //     }
                



        
// Write a program that reads two integers and prints the larger one using a ternary operator.
    // import java.util.Scanner;
    
    // public class revision { 	
    // 	public static void main(String[] args) { 
    //         // Best practice: Use try-with-resources to ensure Scanner is closed automatically
    //         try (Scanner sc = new Scanner(System.in)) {
        	
    //             System.out.print(" Enter first integer: ");
    //             int a = sc.nextInt();
                
    //             System.out.print(" Enter second integer: ");
    //             int b = sc.nextInt();
                
    //             // Ternary Operator: (Condition) ? Value_if_True : Value_if_False;
    //             int larger = (a > b) ? a : b;
                
    //             System.out.println(" The larger integer is: " + larger);
                
    //         } // Scanner is automatically closed here
    // 	} 
    // }





    //Write a program to calculate compound interest using formula A = P*(1 + r/n)^(n*t).
    // import java.util.Scanner;
    // public class revision { 	
    // 	public static void main(String[] args) { 
    //         Scanner sc = new Scanner(System.in);
            
    //         System.out.print(" Enter principal amount (P): ");
    //         double P = sc.nextDouble();
            
    //         System.out.print(" Enter annual interest rate (r) in percentage: ");
    //         double r = sc.nextDouble() / 100; // Convert percentage to decimal
            
    //         System.out.print(" Enter number of times interest is compounded per year (n): ");
    //         int n = sc.nextInt();
            
    //         System.out.print(" Enter time in years (t): ");
    //         double t = sc.nextDouble();
            
    //         // Compound Interest Formula: A = P * (1 + r/n)^(n*t)
    //         double A = P * Math.pow((1 + r / n), (n * t));
            
    //         System.out.printf(" The amount after %.2f years is: %.2f%n", t, A);
            
    //         sc.close(); // Close the scanner to prevent resource leaks
    // 	} 
    // }




//Write a program to demonstrate bitwise AND, OR, XOR between two integers.
// import java.util.Scanner;
// public class revision { 	
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print(" Enter first integer: ");
//         int a = sc.nextInt();
        
//         System.out.print(" Enter second integer: ");
//         int b = sc.nextInt();
        
//         // Bitwise Operations
//         int andResult = a & b; // Bitwise AND
//         int orResult = a | b;  // Bitwise OR
//         int xorResult = a ^ b; // Bitwise XOR
        
//         System.out.println(" Bitwise AND (a & b): " + andResult);
//         System.out.println(" Bitwise OR (a | b): " + orResult);
//         System.out.println(" Bitwise XOR (a ^ b): " + xorResult);
        
//         sc.close(); // Close the scanner to prevent resource leaks
//     } 
// }



// //Write a program to print the Unicode value of any entered character.
//     import java.util.Scanner; // Imports the Scanner class for user input.
    
//     public class revision { 	// Defines the public class.
//     	public static void main(String[] args) { // Main method execution starts here.
            
//             // Use try-with-resources to automatically close the Scanner resource.
//             try (Scanner sc = new Scanner(System.in)) { 
        	
//                 System.out.print(" Enter a character: "); // Prompts the user for a character.
                
//                 // Reads the first character of the next token (word) entered by the user.
//                 char ch = sc.next().charAt(0); 
                
//                 // Explicit Type Casting (Narrowing/Conversion):
//                 // Converts the character's underlying Unicode value (which is stored as a 16-bit number)
//                 // into a standard 32-bit integer (int). This requires the (int) cast.
//                 int unicodeValue = (int) ch; 
                
//                 // Prints the entered character and its corresponding Unicode/ASCII value.
//                 System.out.println(" Unicode value of " + ch + " is: " + unicodeValue); 
                
//             } // Scanner is automatically closed here.
//     	} 
//     }






//Write a program that uses final keyword to define a constant PI = 3.14159 and calculates circle area.
// import java.util.Scanner;
// public class revision { 	
//     public static void main(String[] args) { 
//         final double PI = 3.14159; // Define constant PI
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print(" Enter radius of the circle: ");
//         // Read radius input from user
//         double radius = sc.nextDouble();
        
//         // Calculate area using the formula: area = PI * r * r
//         double area = PI * radius * radius;
        
//         System.out.printf(" The area of the circle with radius %.2f is: %.2f%n", radius, area);
        
//         sc.close(); // Close the scanner to prevent resource leaks
//     } 
// }






// 🔁 Section 2: Control Flow (21–35)




//Write a program to check if a given number is positive, negative, or zero using if-else.
// import java.util.Scanner;
// public class revision { 
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" Enter a number: ");
//         int num = sc.nextInt();
//         if(num > 0){
//          System.out.println(" The number is Positive ");
//         }
//         else if(num < 0){
//     System.out.println(" The number is Negative ");
//         }  
//         else{
//             System.out.println(" The number is Zero ");
//         }
//           } 
//      }


// Write a program to print the grade of a student based on marks:
// import java.util.Scanner;
// public class revision { 
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" Enter marks of student: ");
//         int marks = sc.nextInt();
//         if(marks >= 90){
//          System.out.println(" Grade: A ");
//         }
//         else if(marks >= 80){
//      System.out.println(" Grade: B ");
//         }  
//         else if(marks >= 70){
//             System.out.println(" Grade: C ");
//         }
//         else if(marks >= 60){
//             System.out.println(" Grade: D ");
//         }
//         else{
//             System.out.println(" Grade: F ");
//         }
//           } 
//      }






//Write a program to print the first 10 natural numbers using a for loop.
    // import java.util.Scanner; // Imports the Scanner class for user input (not strictly needed for this loop, but kept for consistency).
    
    // public class revision { 	// Defines the public class.
    // 	public static void main(String[] args) { // Main method execution starts here.
            
    //         // The try-with-resources block is removed since the Scanner is no longer used, simplifying the code.

    //         System.out.println("The first 10 natural numbers are:"); // Print a header
            
    //         // FIX: Use a standard 'for' loop structure.
    //         // 1. Initialization: int i = 1 (start counter at 1)
    //         // 2. Termination: i <= 10 (continue as long as i is 10 or less)
    //         // 3. Increment: i++ (increase the counter by 1 after each iteration)
    //         for (int i = 1; i <= 10; i++) {
                
    //             System.out.println(i); // Prints the current number, followed by a newline.
    //         }
            
    //         // Optional: Print a conclusion statement
    //         System.out.println("Loop finished."); 
            
    // 	} 
    // }






//Write a program to find the sum of the first N numbers using a while loop.




    // import java.util.Scanner; // Imports the Scanner class for reading user input.
    
    // public class revision { 	// Defines the public class.
    // 	public static void main(String[] args) { // Main method execution starts here.
            
    //         // Use try-with-resources to automatically close the Scanner resource.
    //         try (Scanner sc = new Scanner(System.in)) {
                
    //             System.out.print("Enter the value of N (the number of natural numbers to sum): ");
                
    //             // Read the user-defined limit N. InputMismatchException is handled by the catch block.
    //             int N = sc.nextInt();
                
    //             if (N < 1) {
    //                 System.out.println("N must be a positive integer (greater than 0).");
    //                 return; // Exit if N is invalid
    //             }

    //             int sum = 0; // Variable initialized to store the accumulating sum
    //             int i = 1;   // Loop counter, starts at the first natural number
    
    //             System.out.println("\nCalculating sum using a while loop...");
                
    //             // While loop: continues as long as the counter 'i' is less than or equal to N
    //             while (i <= N) {
    //                 sum = sum + i; // Add the current number 'i' to the total sum
    //                 i++;           // Increment the counter to move to the next number
    //             }
    
    //             System.out.println("The sum of the first " + N + " natural numbers is: " + sum); 
            
    //         } catch (java.util.InputMismatchException e) {
    //             // Catch block to handle if the user enters text instead of a number for N.
    //             System.out.println("Invalid input. Please run the program again and enter a whole number for N.");
    //         }
    // 	} 
    // }



//Write a program to print the multiplication table of a given number.
// import java.util.Scanner;
// public class revision{
// public static void main(String [] args ){
// Scanner Sc = new Scanner(System.in) ;
// System.out.print("Enter the number for the multiplication table: ");
// int number = Sc.nextInt();

//     for(int i=1; i<=10; i++ ){
//    int result = number * i;
//     System.out.println(number + " x " + i + " = " + result); 
// }
// }
// }






// Write a program to calculate factorial of a number using a for loop.

    // import java.util.InputMismatchException; // Imports class for handling non-numeric input.
    // import java.util.Scanner;                 // Imports the Scanner class for reading user input.
    
    // public class revision { 	// Defines the public class.
    // 	public static void main(String[] args) { // Main method execution starts here.
            
    //         // Use try-with-resources to automatically close the Scanner resource.
    //         try (Scanner sc = new Scanner(System.in)) { 
                
    //             System.out.print("Enter a positive integer to calculate its factorial: ");
                
    //             // Read the number whose factorial is to be calculated.
    //             int number = sc.nextInt();
                
    //             // Check for non-negative input
    //             if (number < 0) {
    //                 System.out.println("\nError: Factorial is only defined for non-negative integers.");
    //                 return;
    //             }
                
    //             // Use 'long' for the result because factorials (e.g., 20!) quickly exceed the capacity of a standard 'int'.
    //             long factorial = 1; 
                
    //             // Special case for 0! = 1
    //             if (number == 0) {
    //                 factorial = 1;
    //             } else {
    //                 // Loop starts from the given number and goes down to 1 (or starts from 1 up to the number).
    //                 // We use the traditional descending loop for clearer calculation: N * (N-1) * ... * 1
    //                 for (int i = number; i >= 1; i--) { 
    //                     factorial = factorial * i; 
    //                 } 
    //             }
                
    //             System.out.println("\n--- Factorial Calculation ---");
    //             System.out.println("The factorial of " + number + " (" + number + "!) is: " + factorial); 
                
    //             System.out.println("\nCalculation finished.");
            
    //         } catch (InputMismatchException e) {
    //             // Catch block to handle if the user enters text instead of a number.
    //             System.out.println("\nInvalid input. Please run the program again and enter a whole number.");
    //         }
    // 	} 
    // }



// // Write a program to print all even numbers from 1 to 50 using a loop.
// // This program demonstrates printing even numbers up to a fixed limit (50).

// public class revision { 	// Defines the public class.
// 	public static void main(String[] args) { // Main method execution starts here.
        
//         System.out.println("--- Even Numbers from 1 to 50 ---");
        
//         // FIX: The loop variable 'i' must be declared with its type (int).
//         // This loop iterates from i=1 up to i=50.
//         for (int i = 1; i <= 50; i++) { 
            
//             // Logic to check if a number is even: 
//             // The modulo operator (%) returns the remainder. If the remainder is 0, the number is even.
//             if (i % 2 == 0) {
//                 System.out.println(i); 
//             }
//         } 
        
//         System.out.println("\nProcess finished.");
// 	} 
// }



//Write a program that prints numbers from 1 to 10, but skips 5 using continue.
// public class revision{
//     public static void main(String[]args){
//             for (int i = 1; i <= 10; i++) {
//                 if (i == 5) { // Skip the number 5
//                     continue;
//                 }
//                 System.out.println(i);
//             }
//         }
//     }


// Write a program that prints numbers 1–10, but stops when number = 7 using break.
// public class revision { 	// Defines the public class.
// 	public static void main(String[] args) { // Main method execution starts here.
        
//         System.out.println("--- Printing 1-10, Breaking at 7 ---");
        
//         // Loop iterates from i=1 up to i=10
//         for (int i = 1; i <= 10; i++) { 
            
//             // Check if the current number is 7
//             if (i == 7) {
//                 System.out.println("Condition met: i = 7. Stopping loop.");
//                 break; // Halts the execution of the entire for loop immediately.
//             }
            
//             System.out.println(i); // Prints the current number (1, 2, 3, 4, 5, 6)
//         } 
        
//         System.out.println("\nProcess finished.");
// 	} 
// }






//Write a program to print the sum of even numbers between 1 and 100.
// public class revision {
//     public static void main(String[] args) {
//         int sum = 0; // variable to store the sum
//        System.out.println("Even numbers between 1 and 100:");
//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i + " ");//this line prints alll the even numbers 
//                 sum += i; // add even numbers
//             }
//         }

//         System.out.println("The sum of even numbers between 1 and 100 is: " + sum);
//     }
// }





//Write a program that prints a Fibonacci series up to N terms.
// import java.util.Scanner;
// public class revision{
//     public static void main(String[]args ){
// Scanner sc = new Scanner(System.in);
//  System.out.println("Enter the number of terms (N): ");
//  int n = sc.nextInt();
//  int a=0,b=1;
//  System.out.println("Fibonacci Series up to " + n + " terms:");
//   for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }

//         sc.close();
//     }
//     }






//Write a program to reverse digits of a number using a while loop.
// import java.util.Scanner;

// public class revision {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();   // Input number
//         int original = num;       // Store original number
//         int reversed = 0;         // Variable to store reversed number

//         // Reverse logic using while loop
//         while (num != 0) {
//             int digit = num % 10;        // Extract last digit
//             reversed = reversed * 10 + digit; // Append digit to reversed number
//             num = num / 10;              // Remove last digit
//         }

//         System.out.println("Original number: " + original);
//         System.out.println("Reversed number: " + reversed);

//         sc.close();
//     }
// }





// Write a program to find if a number is a prime number or not.
// import java.util.Scanner;
// public class revision{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         boolean isPrime = true; // assume number is prime
//         if (num <= 1) {
//             isPrime = false; // 0 and 1 are not prime
//         } else {
//             // check for factors from 2 to sqrt(num)
//             for (int i = 2; i <= num / 2; i++) {
//                 if (num % i == 0) {
//                     isPrime = false; // found a factor
//                     break;
//                 }
//             }
//         }
//         // print result
//         if (isPrime)
//             System.out.println(num + " is a Prime Number.");
//         else
//             System.out.println(num + " is NOT a Prime Number.");
//         sc.close();
//     }
// }



//Section 3: Arrays & Strings (36–50)




//Write a program to store and print 5 integers using an array.
// public class revision {

//     /**
//      * Stores and prints 5 integers using a fixed-size array in Java.
//      * The array is a fundamental data structure for storing collections of
//      * the same data type.
//      */
//     public static void main(String[] args) {
//         // 1. Array Declaration and Initialization
//         // We declare an integer array named 'numbers' and initialize it immediately
//         // with five integer values. Arrays are zero-indexed, meaning the first
//         // element is at index 0 and the last is at index 4 (since the size is 5).
//         int[] numbers = {15, 25, 35, 45, 55};

//         System.out.println("--- Displaying Integers Stored in the Array (Size: " + numbers.length + ") ---");
//         System.out.println(" "); // Print a newline for better formatting

//         // 2. Printing Array Contents
//         // We use a standard 'for' loop to iterate from the first index (0)
//         // up to (but not including) the total length of the array.
//         for (int i = 0; i < numbers.length; i++) {
//             // Print the index (position) and the value stored at that position.
//             System.out.println("Element at Index [" + i + "]: " + numbers[i]);
//         }

//       System.out.println("\n--- Printing using Enhanced For Loop (For-Each) ---");

//         // Alternatively, use an enhanced 'for' loop (for-each loop) for simple iteration.
//         // This loop reads each 'value' directly from the 'numbers' array.
//         for (int value : numbers) {
//             System.out.println("Value: " + value);
//         }
//     }
// }

 



//  Write a program to find the largest element in an array.
// public class revision {

//     /**
//      * Finds the largest element within a fixed-size integer array.
//      * This is done by iterating through the array and keeping track of the maximum
//      * value encountered so far.
//      */
//     public static void main(String[] args) {
//         // 1. Array Declaration and Initialization
//         // We use a sample array with mixed positive and negative numbers.
//         int[] numbers = {45, 12, 88, 7, 95, 23, -5, 60};

//         // 2. Initialize max value
//         // We assume the first element of the array is the largest initially.
//         int maxElement = numbers[0];

//         System.out.println("The array elements are:");
//         // Print all elements for clarity
//         for (int number : numbers) {
//             System.out.print(number + " ");
//         }
//         System.out.println("\n");

//         // 3. Iterate and Compare
//         // We start the loop from the second element (index 1) since we already
//         // set the first element (index 0) as our initial maximum.
//         for (int i = 1; i < numbers.length; i++) {
//             // Check if the current element is greater than the current maxElement
//             if (numbers[i] > maxElement) {
//                 // If it is, update maxElement to this new, larger value
//                 maxElement = numbers[i];
//             }
//         }

//         // 4. Print the result
//         System.out.println("The largest element in the array is: " + maxElement);
//     }
// }






// Write a program to calculate the sum and average of array elements.




// public class revision {

//     /**
//      * Calculates the sum and average of all elements within a fixed-size integer array.
//      * The sum is calculated using a loop, and the average is calculated using
//      * floating-point division to ensure precision.
//      */
//     public static void main(String[] args) {
//         // 1. Array Declaration and Initialization
//         // We use a sample array with mixed positive and negative numbers.
//         int[] numbers = {45, 12, 88, 7, 95, 23, -5, 60};

//         // 2. Initialize variables for calculation
//         // Using 'long' for sum is safer for larger arrays to prevent potential overflow.
//         long sum = 0;
//         int count = numbers.length;

//         System.out.println("The array elements are:");
//         // Print all elements for clarity
//         for (int number : numbers) {
//             System.out.print(number + " ");
//         }
//         System.out.println("\n");

//         // 3. Calculate the Sum
//         // Use an enhanced for loop (for-each) to easily iterate and sum all elements.
//         for (int number : numbers) {
//             sum += number;
//         }

//         // 4. Calculate the Average
//         // Ensure floating-point division by casting the sum to a double.
//         double average = (double) sum / count;

//         // 5. Print the results
//         System.out.println("--- Calculation Results ---");
//         System.out.println("Total Sum of elements: " + sum);
//         // Using printf to format the average to two decimal places
//         System.out.printf("Average of elements: %.2f\n", average);
//     }
// }




// Write a program to copy one array into another.
// public class revision {

//     /**
//      * Demonstrates how to copy elements from one array (source) to another
//      * (destination) using a simple loop structure.
//      */
//     public static void main(String[] args) {
//         // 1. Source Array Declaration and Initialization
//         int[] sourceArray = {10, 20, 30, 40, 50, 60};
//         System.out.println("--- Source Array (Original) ---");
//         printArray(sourceArray);

//         // 2. Destination Array Declaration
//         // The destination array MUST be initialized with the same size as the source.
//         // Array initialization reserves the necessary memory space.
//         int[] destinationArray = new int[sourceArray.length];

//         // 3. Array Copying using a loop
//         // We iterate through the source array and assign each element to the
//         // corresponding index in the destination array.
//         for (int i = 0; i < sourceArray.length; i++) {
//             destinationArray[i] = sourceArray[i];
//         }

//         System.out.println("\n--- Destination Array (Copied) ---");
//         printArray(destinationArray);

//         // Optional: Verify that changes to the source don't affect the destination
//         // (This confirms a 'deep' copy of primitive values was performed, meaning
//         // the arrays occupy separate memory locations.)
//         sourceArray[0] = 999;
//         System.out.println("\n--- After changing sourceArray[0] to 999 ---");
//         System.out.print("Source Array now: ");
//         printArray(sourceArray);
//         System.out.print("Destination Array still: ");
//         printArray(destinationArray);
//     }

//     /**
//      * Helper method to print the contents of an integer array in a clear format.
//      */
//     public static void printArray(int[] arr) {
//         System.out.print("[");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//             if (i < arr.length - 1) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.println("]");
//     }
// }






// Write a program to reverse an array.
// public class revision {

//     /**
//      * Demonstrates how to reverse the elements of an array in place
//      * using a two-pointer swapping technique.
//      */
//     public static void main(String[] args) {
//         // 1. Array Declaration and Initialization
//         int[] originalArray = {10, 20, 30, 40, 50, 60};
        
//         System.out.println("--- Original Array ---");
//         printArray(originalArray);

//         // 2. Array Reversal Logic (In-Place Swapping)
//         // Initialize two pointers: one at the start (index 0) and one at the end.
//         int start = 0;
//         int end = originalArray.length - 1;

//         // Loop until the pointers cross or meet (start < end).
//         // For an array of even length (like 6), the loop runs 3 times (0,5 -> 1,4 -> 2,3).
//         // For an array of odd length (like 5), the loop runs 2 times (0,4 -> 1,3) and the middle element is left untouched.
//         while (start < end) {
//             // Swap elements at the 'start' and 'end' indices using a temporary variable
//             int temp = originalArray[start];
//             originalArray[start] = originalArray[end];
//             originalArray[end] = temp;

//             // Move the pointers inward
//             start++;
//             end--;
//         }

//         System.out.println("\n--- Reversed Array ---");
//         // The original array now holds the reversed sequence
//         printArray(originalArray);
//     }

//     /**
//      * Helper method to print the contents of an integer array in a clear format.
//      */
//     public static void printArray(int[] arr) {
//         System.out.print("[");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//             if (i < arr.length - 1) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.println("]");
//     }
// }




// Write a program to sort an array in ascending order using any sorting logic (Bubble Sort preferred).


public class revision {

    /**
     * Demonstrates how to sort the elements of an array in ascending order
     * using the Bubble Sort algorithm.
     */
    public static void main(String[] args) {
        // 1. Array Declaration and Initialization
        int[] originalArray = {50, 20, 40, 60, 10, 30};
        
        System.out.println("--- Original Array ---");
        printArray(originalArray);

        // 2. Bubble Sort Logic
        int n = originalArray.length;
        
        // Outer loop: controls the number of passes (n-1 passes are needed)
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: performs the comparison and swapping
            // The largest 'i' elements are already at the end, so we check fewer elements each pass.
            for (int j = 0; j < n - 1 - i; j++) {
                
                // Compare adjacent elements: if the current element is greater than the next one, swap them.
                if (originalArray[j] > originalArray[j + 1]) {
                    // Swap elements using a temporary variable
                    int temp = originalArray[j];
                    originalArray[j] = originalArray[j + 1];
                    originalArray[j + 1] = temp;
                }
            }
        }

        System.out.println("\n--- Sorted Array (Ascending) ---");
        // The original array now holds the sorted sequence
        printArray(originalArray);
    }

    /**
     * Helper method to print the contents of an integer array in a clear format.
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}



// Write a program to search an element in an array using linear search.

// Write a program to create a 2D array and print its elements in matrix form.

// Write a program to find the sum of all elements in a 2D array.

// Write a program to find the diagonal elements and their sum in a 3×3 matrix.

// Write a program to count vowels and consonants in a given String.

// Write a program to check if a given String is a palindrome (same forward and backward).

// Write a program to compare two Strings ignoring case sensitivity.

// Write a program to demonstrate StringBuilder — append your first name, space, and last name.

// Write a program that reads a sentence and counts the number of words in it.





