import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // List example - ArrayList (ordered, allows duplicates)
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate allowed
        System.out.println("List (ArrayList): " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Get element at index 1: " + fruits.get(1));

        // Set example - HashSet (no duplicates, unordered)
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Red"); // duplicate ignored
        System.out.println("\nSet (HashSet): " + colors);
        System.out.println("Contains 'Blue': " + colors.contains("Blue"));

        // Map example - HashMap (key-value pairs)
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Alice", 98); // overwrites previous value
        System.out.println("\nMap (HashMap): " + scores);
        System.out.println("Alice's score: " + scores.get("Alice"));

        // Iterating through collections
        System.out.println("\nIterating through List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating through Set:");
        for (String color : colors) {
            System.out.println(color);
        }
    
        System.out.println("\nIterating through Map:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using generics with custom objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Jane", 22));
        System.out.println("\nStudents: " + students);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
