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



    // 5 write a program to format the following letter using escape sequence characters
    public class chapter3{
        public static void main(String[] args) {
            String letter = "Dear Deepak,\n\tThis Java Course is nice.\nThanks!";
            System.out.println(letter);
        }
    }