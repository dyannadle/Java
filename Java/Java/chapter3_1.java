import java.util.Scanner;

public class chapter3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello World";
        StringBuilder sb = new StringBuilder("Hello");

        while (true) {
            System.out.println("\n=== STRING & STRINGBUILDER MENU ===");
            System.out.println("1. String length()");
            System.out.println("2. charAt()");
            System.out.println("3. concat()");
            System.out.println("4. equals()");
            System.out.println("5. indexOf()");
            System.out.println("6. substring()");
            System.out.println("7. toUpperCase()");
            System.out.println("8. trim()");
            System.out.println("9. replace()");
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
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Length of string: " + str.length());
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Character at index " + index + ": " + str.charAt(index));
                    break;
                case 3:
                    System.out.print("Enter string to concat: ");
                    String toConcat = sc.nextLine();
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
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Substring: " + str.substring(start, end));
                    break;
                case 7:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;
                case 8:
                    System.out.println("Before trim: '" + str + "'");
                    System.out.println("After trim: '" + str.trim() + "'");
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
                    for (String s : parts) System.out.println("  " + s);
                    break;
                case 11:
                    System.out.print("Enter string to append: ");
                    String appendStr = sc.nextLine();
                    sb.append(appendStr);
                    System.out.println("After append(): " + sb);
                    break;
                case 12:
                    System.out.print("Enter index to insert: ");
                    int insertIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter string to insert: ");
                    String insertStr = sc.nextLine();
                    sb.insert(insertIndex, insertStr);
                    System.out.println("After insert(): " + sb);
                    break;
                case 13:
                    System.out.print("Enter start index to delete: ");
                    int delStart = sc.nextInt();
                    System.out.print("Enter end index to delete: ");
                    int delEnd = sc.nextInt();
                    sc.nextLine();
                    sb.delete(delStart, delEnd);
                    System.out.println("After delete(): " + sb);
                    break;
                case 14:
                    System.out.print("Enter start index to replace: ");
                    int repStart = sc.nextInt();
                    System.out.print("Enter end index to replace: ");
                    int repEnd = sc.nextInt();
                    sc.nextLine();
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
                    System.out.print("Enter minimum capacity: ");
                    int minCap = sc.nextInt();
                    sc.nextLine();
                    sb.ensureCapacity(minCap);
                    System.out.println("After ensureCapacity(): " + sb.capacity());
                    break;
                case 18:
                    System.out.print("Enter new length: ");
                    int newLen = sc.nextInt();
                    sc.nextLine();
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
        }
    }
}
