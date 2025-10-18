
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



// This program demonstrates the rules of type casting (implicit and explicit)
// between the integer (int) and floating-point types (float, double) in Java.

public class revision {

    public static void main(String[] args) {

        System.out.println("--- 1. IMPLICIT CASTING (Widening Conversion) ---");
        // Implicit casting is automatic and safe (no data loss).
        // It moves from smaller types (e.g., int) to larger types (e.g., double).

        int myInt = 100; // 32-bit integer
        float myFloat = 1000.5f; // 32-bit floating point

        // 1.1. int to float (Implicit)
        // int is smaller than float, so the conversion is automatic and safe.
        float floatFromInt = myInt; 
        System.out.println("int (" + myInt + ") -> float: " + floatFromInt); // Output: 100.0

        // 1.2. float to double (Implicit)
        // float is smaller than double, so the conversion is automatic and safe.
        double doubleFromFloat = myFloat;
        System.out.println("float (" + myFloat + ") -> double: " + doubleFromFloat); // Output: 1000.5

        // 1.3. int to double (Implicit)
        // int is smaller than double, so the conversion is automatic and safe.
        double doubleFromInt = myInt;
        System.out.println("int (" + myInt + ") -> double: " + doubleFromInt); // Output: 100.0

        System.out.println("\n--- 2. EXPLICIT CASTING (Narrowing Conversion) ---");
        // Explicit casting requires the programmer to use (type) because it is unsafe
        // and may result in data or precision loss (truncation).

        double myDouble = 45.678; // 64-bit floating point
        float largeFloat = 500.99f; // 32-bit floating point

        // 2.1. double to float (Explicit)
        // double is larger than float. Loss of precision is possible (Explicit cast required).
        float floatFromDouble = (float) myDouble;
        System.out.println("double (" + myDouble + ") -> float: " + floatFromDouble);

        // 2.2. float to int (Explicit)
        // float is larger than int. The decimal part is TRUNCATED (data loss).
        int intFromFloat = (int) largeFloat;
        System.out.println("float (" + largeFloat + ") -> int: " + intFromFloat); // Output: 500

        // 2.3. double to int (Explicit)
        // double is much larger than int. Both decimal loss and truncation occur.
        int intFromDouble = (int) myDouble;
        System.out.println("double (" + myDouble + ") -> int: " + intFromDouble); // Output: 45
    }
}
