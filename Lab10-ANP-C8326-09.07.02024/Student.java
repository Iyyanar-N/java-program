import detail.StudentDetails;
import mark.Marks;
import sturesult.Result;

public class Student {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails("John Doe", 123);
        Marks marks = new Marks(85, 90, 95);
        Result result = new Result(student, marks);

        result.displayResult();
    }
}
//details
package detail;

public class StudentDetails {
    private String name;
    private int rollNumber;

    public StudentDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
//
package mark;

public class Marks {
    private int subject1;
    private int subject2;
    private int subject3;

    public Marks(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public int getTotal() {
return subject1 + subject2 + subject3;
    }
}

//result
package sturesult;
import detail.StudentDetails;
import mark.Marks;

public class Result {
    private StudentDetails studentDetails;
    private Marks marks;

    public Result(StudentDetails studentDetails, Marks marks) {
        this.studentDetails = studentDetails;
        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Student Name: " + studentDetails.getName());
        System.out.println("Roll Number: " + studentDetails.getRollNumber());
        System.out.println("Marks in Subject 1: " + marks.getSubject1());
        System.out.println("Marks in Subject 2: " + marks.getSubject2());
        System.out.println("Marks in Subject 3: " + marks.getSubject3());
        System.out.println("Total Marks: " + marks.getTotal());
    }
}

        return subject1 + subject2 + subject3;
    }
}

