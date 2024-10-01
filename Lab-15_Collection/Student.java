import java.util.ArrayList;
 class Student {
    // Fields
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // toString method to display the student's information
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Create an ArrayList to hold Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 Student objects to the ArrayList
        students.add(new Student("John", 20, "A"));
        students.add(new Student("Jane", 21, "B"));
        students.add(new Student("Tom", 22, "A"));
        students.add(new Student("Lucy", 23, "C"));
        students.add(new Student("Peter", 20, "B"));
        students.add(new Student("Sarah", 21, "A"));
        students.add(new Student("Mike", 22, "B"));
        students.add(new Student("Anna", 23, "A"));
        students.add(new Student("Chris", 20, "C"));
        students.add(new Student("Sophia", 21, "B"));

        // Change the name of the first student
        students.get(0).setName("Jonathan");

        // Print each student using a for-each loop
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

: -------------- :
:  ** OUTPUT **  :
: -------------- :
C:\Users\GANAPATHI>cd\

C:\>cd javalap

C:\Javalap>javac Main1.java

C:\Javalap>java  Main1
Student{name='Jonathan', age=20, grade='A'}
Student{name='Jane', age=21, grade='B'}
Student{name='Tom', age=22, grade='A'}
Student{name='Lucy', age=23, grade='C'}
Student{name='Peter', age=20, grade='B'}
Student{name='Sarah', age=21, grade='A'}
Student{name='Mike', age=22, grade='B'}
Student{name='Anna', age=23, grade='A'}
Student{name='Chris', age=20, grade='C'}
Student{name='Sophia', age=21, grade='B'}

C:\Javalap>