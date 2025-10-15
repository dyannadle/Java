// 1 print the given string to lower case

// public class chapter3{
//     public static void main(String[] args) {
//         String name = "Deepak Yannadle ";
//         name = name.toLowerCase();
//         System.out.println(name);   
//     }
// }   


// 2 write a program to replace spaces with underscores
//  public class chapter3{
//     public static void main(String[] args) {
//         String name = "Deepak Ramakant Yannadle";
//         name = name.replace(" ","_");   
//         System.out.println(name);
//     }
//  }

// 3 write a program to fill in a letter template given below with name and date
// letter = "Dear <|name|>, Thanks a lot"   

// public class chapter3{
//     public static void main(String[] args) {
//         String letter = "Dear <|name|>, Thanks a lot!";
//         letter = letter.replace("<|name|>","Deepak");
//         System.out.println(letter);
//     }
// }



// 4 write a program to detect double and triple spaces in a string
    // public class chapter3{
    //     public static void main(String[] args) {
    //         String name = "This  is  a  string   with double and triple spaces.";
    //         System.out.println(name.indexOf("  "));
    //         System.out.println(name.indexOf("   "));
    //     }
    // }



    // // 5 write a program to format the following letter using escape sequence characters
    // public class chapter3{
    //     public static void main(String[] args) {
    //         String letter = "Dear Deepak,\n\tThis Java Course is nice.\nThanks!";
    //         System.out.println(letter);
    //     }
    // }


// 6 write a program to trim the following string

//not able to understand the question

// public class chapter3{
//     public static void main(String[] args) {
//         String name = "    Deepak Yannadle    ";
//         System.out.println(name);
//         System.out.println(name.trim());
//     }
// }

// 7 write a program to find out the length of the string
// public class chapter3{
//     public static void main(String[] args) {
//         String name = "Deepak Yannadle";
//         System.out.println(name.length());
//     }
// }



// 8 write a program to check if the string starts with "Dear" and ends with "Thanks"
// public class chapter3{
//     public static void main(String[] args) {
//         String letter = "Dear Deepak, Thanks a lot!";
//         System.out.println(letter.startsWith("Dear"));
//         System.out.println(letter.endsWith("Thanks"));
//     }
// }

// 9 write a program to find the index of the substring "Java" in the following string
// public class chapter3{  
//     public static void main(String[] args) {
//         String name = "This course is about Java";
//         System.out.println(name.indexOf("Java"));
//     }
// }

// 10 write a program to check if the string contains the substring "Java"
// public class chapter3{
//     public static void main(String[] args) {
//         String name = "This course is about Java";
//         System.out.println(name.contains("Java"));
//     }
// }

// 11 write a program to convert the string to character array and print each character in a new line
// public class chapter3{
//     public static void main(String[] args) {
//         String name = "Deepak Yannadle";// convert to character array
//         char[] ch = name.toCharArray();// print each character in a new line
//         for(int i=0; i<ch.length; i++){// length is a property of array
//             System.out.println(ch[i]);// print each character in a new line
//         }
//     }
// }


// 12 write a program to compare two strings using == and equals() method
// public class chapter3{
//     // == operator compares the references of the strings
//     // equals() method compares the values of the strings
//     //didnt understand the above two lines
//     public static void main(String[] args) {
//         String name1 = "Deepak";// created in string pool
//         String name2 = new String("Deepak");// created in heap memory
//         System.out.println(name1==name2);// false
//         //
//         System.out.println(name1.equals(name2));// true
//     }
// }


// 13 write a program to demonstrate string immutability
// public class chapter3{
//     public static void main(String[] args) {
//         String name = "Deepak";// created in string pool
//         name = name + " Yannadle";// new string is created in heap memory
//         System.out.println(name);
//     }
// }
// when we change the value of the string, a new string is created in heap memory
// the old string is still in the string pool
// this is called string immutability
// if we want to change the value of the string, we have to create a new string
// this is done to save memory  
// if we want to change the value of the string without creating a new string, we can use StringBuilder or StringBuffer 
// StringBuilder and StringBuffer are mutable
// StringBuilder is faster than StringBuffer
// StringBuffer is thread safe
// StringBuilder is not thread safe
// StringBuilder is used in single thread environment
// StringBuffer is used in multi thread environment
// StringBuilder and StringBuffer are not stored in string pool 
// StringBuilder and StringBuffer are stored in heap memory
// StringBuilder and StringBuffer are classes in java.lang package
// StringBuilder and StringBuffer have many methods to manipulate strings
// some of the methods are append(), insert(), delete(), replace(), reverse(), capacity(), ensureCapacity(), trimToSize(), setLength(), charAt(), indexOf(), lastIndexOf(), substring(), toString()






// Program to demonstrate all major StringBuilder methods in Java

// public class chapter3 {
//     public static void main(String[] args) {

//         // 1. Create a StringBuilder object
//         StringBuilder sb = new StringBuilder("Hello");

//         // 2. append() - Adds text to the end of the existing string
//         sb.append(" World");
//         System.out.println("After append(): " + sb);

//         // 3. insert() - Inserts text at a specified position
//         sb.insert(5, ", Beautiful");
//         System.out.println("After insert(): " + sb);

//         // 4. delete() - Deletes characters between the given indexes
//         sb.delete(5, 16);
//         System.out.println("After delete(): " + sb);

//         // 5. replace() - Replaces characters in a specified range
//         sb.replace(0, 5, "Hi");
//         System.out.println("After replace(): " + sb);

//         // 6. reverse() - Reverses the string
//         sb.reverse();
//         System.out.println("After reverse(): " + sb);

//         // 7. reverse again to get back original text for next operations
//         sb.reverse();

//         // 8. capacity() - Shows the current capacity of the StringBuilder
//         System.out.println("Current capacity: " + sb.capacity());

//         // 9. ensureCapacity() - Ensures minimum capacity
//         sb.ensureCapacity(50);
//         System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

//         // 10. trimToSize() - Reduces the capacity to the current length
//         sb.trimToSize();
//         System.out.println("Capacity after trimToSize(): " + sb.capacity());

//         // 11. setLength() - Changes the length of the string
//         sb.setLength(3);
//         System.out.println("After setLength(3): " + sb);

//         // Reset sb for next examples
//         sb = new StringBuilder("Hello Java World");

//         // 12. charAt() - Returns the character at a given index
//         char ch = sb.charAt(6);
//         System.out.println("Character at index 6: " + ch);

//         // 13. indexOf() - Finds the first occurrence of a substring
//         int index1 = sb.indexOf("Java");
//         System.out.println("Index of 'Java': " + index1);

//         // 14. lastIndexOf() - Finds the last occurrence of a substring
//         int index2 = sb.lastIndexOf("o");
//         System.out.println("Last index of 'o': " + index2);

//         // 15. substring() - Returns a portion of the string
//         String sub = sb.substring(6, 10);
//         System.out.println("Substring (6,10): " + sub);

//         // 16. toString() - Converts StringBuilder to String
//         String finalString = sb.toString();
//         System.out.println("Final String using toString(): " + finalString);
//     }
// }





// Program to demonstrate all major String and StringBuilder methods in Java

// public class chapter3 {
//     public static void main(String[] args) {

//         System.out.println("=== STRING METHODS ===");

//         // Creating Strings
//         String str1 = "Hello World";
//         String str2 = "Java Programming";
//         String str3 = "   Trim Example   ";

//         // 1. length()
//         System.out.println("Length of str1: " + str1.length());

//         // 2. charAt()
//         System.out.println("Character at index 4: " + str1.charAt(4));

//         // 3. concat()
//         System.out.println("Concatenation: " + str1.concat(" " + str2));

//         // 4. isEmpty()
//         System.out.println("Is str1 empty? " + str1.isEmpty());

//         // 5. equals() and equalsIgnoreCase()
//         System.out.println("Equals (case-sensitive): " + str1.equals("hello world"));
//         System.out.println("Equals (ignore case): " + str1.equalsIgnoreCase("hello world"));

//         // 6. compareTo() and compareToIgnoreCase()
//         System.out.println("CompareTo: " + str1.compareTo(str2));
//         System.out.println("CompareToIgnoreCase: " + str1.compareToIgnoreCase(str2));

//         // 7. indexOf() and lastIndexOf()
//         System.out.println("Index of 'o': " + str1.indexOf('o'));
//         System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));

//         // 8. contains()
//         System.out.println("Contains 'World'? " + str1.contains("World"));

//         // 9. startsWith() and endsWith()
//         System.out.println("Starts with 'He'? " + str1.startsWith("He"));
//         System.out.println("Ends with 'ld'? " + str1.endsWith("ld"));

//         // 10. substring()
//         System.out.println("Substring(0,5): " + str1.substring(0, 5));

//         // 11. toUpperCase() and toLowerCase()
//         System.out.println("Uppercase: " + str1.toUpperCase());
//         System.out.println("Lowercase: " + str1.toLowerCase());

//         // 12. trim()
//         System.out.println("Before trim: '" + str3 + "'");
//         System.out.println("After trim: '" + str3.trim() + "'");

//         // 13. replace()
//         System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

//         // 14. split()
//         String[] words = str2.split(" ");
//         System.out.println("Split result:");
//         for (String w : words) {
//             System.out.println("  " + w);
//         }

//         // 15. join()
//         String joined = String.join("-", "Java", "is", "fun");
//         System.out.println("Joined string: " + joined);

//         // 16. toCharArray()
//         char[] chars = str1.toCharArray();
//         System.out.print("Characters in str1: ");
//         for (char c : chars) {
//             System.out.print(c + " ");
//         }
//         System.out.println();

//         // 17. valueOf()
//         int number = 123;
//         String numStr = String.valueOf(number);
//         System.out.println("ValueOf(123): " + numStr);

//         // 18. format()
//         String formatted = String.format("My name is %s and I am %d years old.", "John", 25);
//         System.out.println("Formatted string: " + formatted);

//         System.out.println("\n=== STRINGBUILDER METHODS ===");

//         // Create StringBuilder
//         StringBuilder sb = new StringBuilder("Hello");

//         // 1. append()
//         sb.append(" World");
//         System.out.println("After append(): " + sb);

//         // 2. insert()
//         sb.insert(5, ", Beautiful");
//         System.out.println("After insert(): " + sb);

//         // 3. delete()
//         sb.delete(5, 16);
//         System.out.println("After delete(): " + sb);

//         // 4. replace()
//         sb.replace(0, 5, "Hi");
//         System.out.println("After replace(): " + sb);

//         // 5. reverse()
//         sb.reverse();
//         System.out.println("After reverse(): " + sb);
//         sb.reverse(); // reverse back for next examples

//         // 6. capacity()
//         System.out.println("Current capacity: " + sb.capacity());

//         // 7. ensureCapacity()
//         sb.ensureCapacity(50);
//         System.out.println("After ensureCapacity(50): " + sb.capacity());

//         // 8. trimToSize()
//         sb.trimToSize();
//         System.out.println("After trimToSize(): " + sb.capacity());

//         // 9. setLength()
//         sb.setLength(3);
//         System.out.println("After setLength(3): " + sb);

//         // Reset for more examples
//         sb = new StringBuilder("Hello Java World");

//         // 10. charAt()
//         System.out.println("Character at index 6: " + sb.charAt(6));

//         // 11. indexOf() and lastIndexOf()
//         System.out.println("Index of 'Java': " + sb.indexOf("Java"));
//         System.out.println("Last index of 'o': " + sb.lastIndexOf("o"));

//         // 12. substring()
//         System.out.println("Substring(6,10): " + sb.substring(6, 10));

//         // 13. toString()
//         System.out.println("Final String from StringBuilder: " + sb.toString());
//     }
// }




// String and StringBuilder methods menu-driven program
import java.util.InputMismatchException; // Imports the exception class for handling incorrect input types
import java.util.Scanner;                 // Imports the Scanner class for reading user input

public class chapter3 { // Defines the public class named chapter3

    public static void main(String[] args) { // The main method, the starting point of the program
        
        // Use try-with-resources to automatically close the Scanner (prevents resource leak)
        try (Scanner sc = new Scanner(System.in)) { 
            
            String str = "  Hello World  "; // Initializes an immutable String object (added spaces for trim() demo)
            StringBuilder sb = new StringBuilder("Hello"); // Initializes a mutable StringBuilder object
            
            while (true) { // Starts an infinite loop for the menu (will be broken by case 20)
                
                // --- Display Menu and Current State ---
                System.out.println("\n=== STRING & STRINGBUILDER MENU ==="); // Prints the main menu title
                System.out.println("Current String: \"" + str + "\"");      // Shows the current value of the String
                System.out.println("Current StringBuilder: \"" + sb + "\""); // Shows the current value of the StringBuilder

                System.out.println("-----------------------------------");
                System.out.println("1. String length()");
                System.out.println("2. charAt()");
                System.out.println("3. concat()");
                System.out.println("4. equals()");
                System.out.println("5. indexOf()");
                System.out.println("6. substring()");
                System.out.println("7. toUpperCase()");
                System.out.println("8. trim()");
                System.out.println("9. replace() (String)");
                System.out.println("10. split()");
                System.out.println("11. StringBuilder append()");
                System.out.println("12. insert()");
                System.out.println("13. delete()");
                System.out.println("14. replace() (StringBuilder)");
                System.out.println("15. reverse()");
                System.out.println("16. capacity()");
                System.out.println("17. ensureCapacity()");
                System.out.println("18. setLength()");
                System.out.println("19. toString() (StringBuilder)");
                System.out.println("20. Exit");
                System.out.print("Choose an option: "); // Prompt the user for a choice
                
                try {
                    // --- Input Reading with InputMismatchException Handling ---
                    int choice = sc.nextInt();    // Reads the integer menu choice (can throw InputMismatchException)
                    sc.nextLine();                // Consumes the remaining newline character after nextInt()
                    
                    // --- Switch Statement for Menu Operations ---
                    switch (choice) {
                        case 1: // String length()
                            System.out.println("Length of string: " + str.length());
                            break;
                        case 2: // String charAt()
                            System.out.print("Enter index (0 to " + (str.length() - 1) + "): ");
                            int index = sc.nextInt();
                            sc.nextLine(); 
                            System.out.println("Character at index " + index + ": " + str.charAt(index)); // Can throw IndexOutOfBoundsException
                            break;
                        case 3: // String concat()
                            System.out.print("Enter string to concat: ");
                            String toConcat = sc.nextLine();
                            System.out.println("Result: " + str.concat(toConcat));
                            break;
                        case 4: // String equals()
                            System.out.print("Enter string to compare: ");
                            String compareStr = sc.nextLine();
                            System.out.println("Equals? " + str.equals(compareStr));
                            break;
                        case 5: // String indexOf()
                            System.out.print("Enter substring to find index: ");
                            String subStr = sc.nextLine();
                            System.out.println("Index of \"" + subStr + "\": " + str.indexOf(subStr));
                            break;
                        case 6: // String substring()
                            System.out.print("Enter start index for substring: ");
                            int start = sc.nextInt();
                            sc.nextLine(); 
                            System.out.print("Enter end index for substring: ");
                            int end = sc.nextInt();
                            sc.nextLine(); 
                            System.out.println("Substring: " + str.substring(start, end)); // Can throw IndexOutOfBoundsException
                            break;
                        case 7: // String toUpperCase()
                            System.out.println("Uppercase: " + str.toUpperCase());
                            break;
                        case 8: // String trim()
                            System.out.println("Trimmed string: \"" + str.trim() + "\""); // Removes leading/trailing spaces
                            break;
                        case 9: // String replace()
                            System.out.print("Enter target substring to replace: ");
                            String target = sc.nextLine();
                            System.out.print("Enter replacement substring: ");
                            String replacement = sc.nextLine();
                            System.out.println("Result: " + str.replace(target, replacement));
                            break;
                        case 10: // String split()
                            System.out.print("Enter delimiter for split: ");
                            String delimiter = sc.nextLine();
                            String[] parts = str.split(delimiter); // Splits the string into an array
                            System.out.println("Split parts:");
                            for (String part : parts) {
                                System.out.println(" | " + part);
                            }
                            break;
                            
                        // --- STRINGBUILDER METHODS (FIX: COMPLETED CASES 11-20) ---
                        case 11: // StringBuilder append()
                            System.out.print("Enter string to append: ");
                            String appendStr = sc.nextLine();
                            sb.append(appendStr); // Appends the string to the end of the StringBuilder
                            System.out.println("After append(): " + sb);
                            break;
                        case 12: // StringBuilder insert()
                            System.out.print("Enter index to insert (0 to " + sb.length() + "): ");
                            int insertIndex = sc.nextInt();
                            sc.nextLine(); 
                            System.out.print("Enter string to insert: ");
                            String insertStr = sc.nextLine();
                            sb.insert(insertIndex, insertStr); // Inserts the string at the specified index
                            System.out.println("After insert(): " + sb);
                            break;
                        case 13: // StringBuilder delete()
                            System.out.print("Enter start index to delete: ");
                            int delStart = sc.nextInt();
                            sc.nextLine(); 
                            System.out.print("Enter end index to delete: ");
                            int delEnd = sc.nextInt();
                            sc.nextLine(); 
                            sb.delete(delStart, delEnd); // Deletes characters from start (inclusive) to end (exclusive)
                            System.out.println("After delete(): " + sb);
                            break;
                        case 14: // StringBuilder replace()
                            System.out.print("Enter start index to replace: ");
                            int repStart = sc.nextInt();
                            sc.nextLine(); 
                            System.out.print("Enter end index to replace: ");
                            int repEnd = sc.nextInt();
                            sc.nextLine(); 
                            System.out.print("Enter replacement string: ");
                            String repStr = sc.nextLine();
                            sb.replace(repStart, repEnd, repStr); // Replaces substring with a new string
                            System.out.println("After replace(): " + sb);
                            break;
                        case 15: // StringBuilder reverse()
                            sb.reverse(); // Reverses the sequence of characters
                            System.out.println("After reverse(): " + sb);
                            break;
                        case 16: // StringBuilder capacity()
                            System.out.println("Current capacity: " + sb.capacity()); // Reports current allocated buffer size
                            break;
                        case 17: // StringBuilder ensureCapacity()
                            System.out.print("Enter minimum capacity to ensure: ");
                            int minCap = sc.nextInt();
                            sc.nextLine(); 
                            sb.ensureCapacity(minCap); // Ensures the capacity is at least the specified minimum
                            System.out.println("New capacity: " + sb.capacity());
                            break;
                        case 18: // StringBuilder setLength()
                            System.out.print("Enter new length: ");
                            int newLen = sc.nextInt();
                            sc.nextLine(); 
                            sb.setLength(newLen); // Sets the new length, truncating or padding with null characters
                            System.out.println("After setLength(): \"" + sb + "\" (Length: " + sb.length() + ")");
                            break;
                        case 19: // StringBuilder toString()
                            System.out.println("StringBuilder converted to String: " + sb.toString()); // Converts mutable SB to immutable String
                            break;
                        case 20: // Exit program
                            System.out.println("Exiting program. Goodbye!");
                            return; // Terminates the main method and the program
                        default:
                            System.out.println("Invalid option! Please select a number between 1 and 20.");
                    }
                } catch (InputMismatchException e) {
                    // FIX: Catches when user types text instead of a number for choice or index
                    System.out.println("\n!! ERROR: Invalid input type! Please enter a number for the choice or index.");
                    sc.nextLine(); // Must clear the bad input from the buffer
                } catch (IndexOutOfBoundsException e) {
                    // Catches when user enters an index that is out of the string/builder boundaries
                    System.out.println("\n!! ERROR: Index out of bounds. Check the start/end range relative to the length.");
                } catch (Exception e) {
                    // Catches any other unexpected runtime exceptions
                    System.out.println("\n!! UNEXPECTED ERROR: " + e.getMessage());
                }
            }
        } // The Scanner 'sc' is automatically closed here
    }
}