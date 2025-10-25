
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




    import java.util.Arrays;
    import java.util.List;

    public class revision {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Skip the first 3 elements
            numbers.stream()
                   .skip(2)
                   .forEach(System.out::println);
        }
    }