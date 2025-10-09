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
public class chapter3{
    // == operator compares the references of the strings
    // equals() method compares the values of the strings
    //didnt understand the above two lines
    public static void main(String[] args) {
        String name1 = "Deepak";
        String name2 = new String("Deepak");
        System.out.println(name1==name2);// false
        System.out.println(name1.equals(name2));// true
    }
}