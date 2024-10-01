// Class Student
class Student {
    private String name;
    private int age;
    private char grade;
    // Constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getGrade() {
        return grade;
    }
}
// Utility class
public class ArrayUtils1 {
    // Method to calculate the average of elements in an integer array
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
    // Method to find the index of a Student object by name
    public static int findStudentByName(Student[] students, String name) {
        if (students == null || name == null) {
            throw new IllegalArgumentException("Students array and name must not be null");
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return i;
            }
        }
        return -1; // Student not found
    }
    public static void main(String[] args) {
        // Initialize an array of Student objects
        Student[] students = {
            new Student("Jazz", 20, 'B'),
            new Student("Jaya", 21, 'B'),
            new Student("Mona", 20, 'A'),
            new Student("Iyyanar", 21, 'C'),
            new Student("Abi", 21, 'A')
        };
        // Calculate and print the average age
        int[] ages = {20, 21, 20, 21, 21};
        double average = calculateAverage(ages);
        System.out.println("Average age: " + average);
        // Find and print the index of a student by name
        String searchName = "Mona";
        int index = findStudentByName(students, searchName);
        System.out.println("Index of student " + searchName + ": " + index);
    }
}

OUTPUT :

C:\Javalap\nisha>javac ArrayUtils1.java

C:\Javalap\nisha>java ArrayUtils1
Average age: 20.6
Index of student Mona: 2



