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

public class chapter3 {
    public static void main(String[] args) {

        System.out.println("=== STRING METHODS ===");

        // Creating Strings
        String str1 = "Hello World";
        String str2 = "Java Programming";
        String str3 = "   Trim Example   ";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. charAt()
        System.out.println("Character at index 4: " + str1.charAt(4));

        // 3. concat()
        System.out.println("Concatenation: " + str1.concat(" " + str2));

        // 4. isEmpty()
        System.out.println("Is str1 empty? " + str1.isEmpty());

        // 5. equals() and equalsIgnoreCase()
        System.out.println("Equals (case-sensitive): " + str1.equals("hello world"));
        System.out.println("Equals (ignore case): " + str1.equalsIgnoreCase("hello world"));

        // 6. compareTo() and compareToIgnoreCase()
        System.out.println("CompareTo: " + str1.compareTo(str2));
        System.out.println("CompareToIgnoreCase: " + str1.compareToIgnoreCase(str2));

        // 7. indexOf() and lastIndexOf()
        System.out.println("Index of 'o': " + str1.indexOf('o'));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));

        // 8. contains()
        System.out.println("Contains 'World'? " + str1.contains("World"));

        // 9. startsWith() and endsWith()
        System.out.println("Starts with 'He'? " + str1.startsWith("He"));
        System.out.println("Ends with 'ld'? " + str1.endsWith("ld"));

        // 10. substring()
        System.out.println("Substring(0,5): " + str1.substring(0, 5));

        // 11. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 12. trim()
        System.out.println("Before trim: '" + str3 + "'");
        System.out.println("After trim: '" + str3.trim() + "'");

        // 13. replace()
        System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));

        // 14. split()
        String[] words = str2.split(" ");
        System.out.println("Split result:");
        for (String w : words) {
            System.out.println("  " + w);
        }

        // 15. join()
        String joined = String.join("-", "Java", "is", "fun");
        System.out.println("Joined string: " + joined);

        // 16. toCharArray()
        char[] chars = str1.toCharArray();
        System.out.print("Characters in str1: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 17. valueOf()
        int number = 123;
        String numStr = String.valueOf(number);
        System.out.println("ValueOf(123): " + numStr);

        // 18. format()
        String formatted = String.format("My name is %s and I am %d years old.", "John", 25);
        System.out.println("Formatted string: " + formatted);

        System.out.println("\n=== STRINGBUILDER METHODS ===");

        // Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("After append(): " + sb);

        // 2. insert()
        sb.insert(5, ", Beautiful");
        System.out.println("After insert(): " + sb);

        // 3. delete()
        sb.delete(5, 16);
        System.out.println("After delete(): " + sb);

        // 4. replace()
        sb.replace(0, 5, "Hi");
        System.out.println("After replace(): " + sb);

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);
        sb.reverse(); // reverse back for next examples

        // 6. capacity()
        System.out.println("Current capacity: " + sb.capacity());

        // 7. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("After ensureCapacity(50): " + sb.capacity());

        // 8. trimToSize()
        sb.trimToSize();
        System.out.println("After trimToSize(): " + sb.capacity());

        // 9. setLength()
        sb.setLength(3);
        System.out.println("After setLength(3): " + sb);

        // Reset for more examples
        sb = new StringBuilder("Hello Java World");

        // 10. charAt()
        System.out.println("Character at index 6: " + sb.charAt(6));

        // 11. indexOf() and lastIndexOf()
        System.out.println("Index of 'Java': " + sb.indexOf("Java"));
        System.out.println("Last index of 'o': " + sb.lastIndexOf("o"));

        // 12. substring()
        System.out.println("Substring(6,10): " + sb.substring(6, 10));

        // 13. toString()
        System.out.println("Final String from StringBuilder: " + sb.toString());
    }
}
