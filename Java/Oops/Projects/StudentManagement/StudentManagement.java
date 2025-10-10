import java.io.*;
import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name + " - " + age;
    }
}

public class StudentManagement {
    static List<Student> students = new ArrayList<>();

    public static void addStudent(int roll, String name, int age) {
        students.add(new Student(roll, name, age));
    }


    public static Student searchStudent(int roll) {
        for(Student s : students) {
            if(s.rollNo == roll) return s;
        }
        return null;
    }

    public static void deleteStudent(int roll) {
        students.removeIf(s -> s.rollNo == roll);
    }

    public static void saveToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
        for(Student s : students) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        addStudent(1, "Deepak", 23);
        addStudent(2, "Omkar", 22);

        System.out.println("Search: " + searchStudent(1));
        deleteStudent(2);

        saveToFile();
        System.out.println("Students saved to file!");
    }
}
