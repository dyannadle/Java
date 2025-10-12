import java.util.InputMismatchException;
import java.util.Scanner;

public class chapter3_1 {

    private static Scanner sc = new Scanner(System.in);
    
    // Utility method to safely get an integer input
    private static int getSafeIntInput(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a whole number.");
            System.out.print(prompt);
            sc.next(); // Consume the invalid input (like "deepak")
        }
        int value = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline
        return value;
    }

    public static void main(String[] args) {
        // Initial values for demonstration
        String str = "  Hello World  "; // Added spaces to test trim()
        StringBuilder sb = new StringBuilder("Hello");

        while (true) {
            System.out.println("\n=== STRING & STRINGBUILDER MENU ===");
            System.out.println("Current String: \"" + str.trim() + "\"");
            System.out.println("Current StringBuilder: \"" + sb + "\"");
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
            
            // --- Input Validation for Menu Choice ---
            int choice = getSafeIntInput("Choose an option: ");
            
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Length of string: " + str.length());
                        break;
                    case 2:
                        int index = getSafeIntInput("Enter index (0 to " + (str.length() - 1) + "): ");
                        System.out.println("Character at index " + index + ": " + str.charAt(index));
                        break;
                    case 3:
                        System.out.print("Enter string to concat: ");
                        String toConcat = sc.nextLine();
                        // Note: str is immutable, so this result is just printed
                        System.out.println("Result: " + str.concat(toConcat));
                        break;
                    case 4:
                        System.out.print("Enter string to compare: ");
                        String compareStr = sc.nextLine();
                        System.out.println("Equals? " + str.equals(compareStr));
                        break;
                    case 5:
                        System.out.print("Enter substring to find index: ");
                        String subStr = sc.nextLine();
                        System.out.println("Index: " + str.indexOf(subStr));
                        break;
                    case 6:
                        int start = getSafeIntInput("Enter start index: ");
                        int end = getSafeIntInput("Enter end index: ");
                        System.out.println("Substring: " + str.substring(start, end));
                        break;
                    case 7:
                        System.out.println("Uppercase: " + str.toUpperCase());
                        break;
                    case 8:
                        System.out.println("String before trim: '" + str + "'");
                        System.out.println("String after trim: '" + str.trim() + "'");
                        break;
                    case 9:
                        System.out.print("Enter old string: ");
                        String oldStr = sc.nextLine();
                        System.out.print("Enter new string: ");
                        String newStr = sc.nextLine();
                        System.out.println("Result: " + str.replace(oldStr, newStr));
                        break;
                    case 10:
                        System.out.print("Enter delimiter for split: ");
                        String delim = sc.nextLine();
                        String[] parts = str.split(delim);
                        System.out.println("Split result:");
                        for (String s : parts) System.out.println("   " + s);
                        break;
                    case 11:
                        System.out.print("Enter string to append: ");
                        String appendStr = sc.nextLine();
                        sb.append(appendStr);
                        System.out.println("After append(): " + sb);
                        break;
                    case 12:
                        int insertIndex = getSafeIntInput("Enter index to insert: ");
                        System.out.print("Enter string to insert: ");
                        String insertStr = sc.nextLine();
                        sb.insert(insertIndex, insertStr);
                        System.out.println("After insert(): " + sb);
                        break;
                    case 13:
                        int delStart = getSafeIntInput("Enter start index to delete: ");
                        int delEnd = getSafeIntInput("Enter end index to delete: ");
                        sb.delete(delStart, delEnd);
                        System.out.println("After delete(): " + sb);
                        break;
                    case 14:
                        int repStart = getSafeIntInput("Enter start index to replace: ");
                        int repEnd = getSafeIntInput("Enter end index to replace: ");
                        System.out.print("Enter replacement string: ");
                        String repStr = sc.nextLine();
                        sb.replace(repStart, repEnd, repStr);
                        System.out.println("After replace(): " + sb);
                        break;
                    case 15:
                        sb.reverse();
                        System.out.println("After reverse(): " + sb);
                        break;
                    case 16:
                        System.out.println("Current capacity: " + sb.capacity());
                        break;
                    case 17:
                        int minCap = getSafeIntInput("Enter minimum capacity: ");
                        sb.ensureCapacity(minCap);
                        System.out.println("After ensureCapacity(), new capacity: " + sb.capacity());
                        break;
                    case 18:
                        int newLen = getSafeIntInput("Enter new length: ");
                        sb.setLength(newLen);
                        System.out.println("After setLength(): " + sb);
                        break;
                    case 19:
                        System.out.println("StringBuilder as String: " + sb.toString());
                        break;
                    case 20:
                        System.out.println("Exiting program...");
                        sc.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid option! Try again.");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\n!! ERROR: Index out of bounds. Please check the current length/capacity.");
                // System.out.println("Debug Info: " + e.getMessage()); // Optional for debugging
            } catch (Exception e) {
                System.out.println("\n!! UNEXPECTED ERROR: " + e.getMessage());
            }
        }
    }
}