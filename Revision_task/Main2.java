// 2. Design a Java class called Student with attributes id, name, and marks:
// ● Create a method to calculate the grade based on marks using this rule:
// ○ 80+ : A
// ○ 60–79 : B
// ○ 40–59 : C
// ○ Below 40 : F
// ● Create multiple student objects and display their grades.


class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 80) return 'A';
        else if (marks >= 60) return 'B';
        else if (marks >= 40) return 'C';
        else return 'F';
    }

    void displayGrade() {
        System.out.println(name + "'s Grade: " + calculateGrade());
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 85.5);
        Student s2 = new Student(102, "Bob", 55.0);

        s1.displayGrade(); 
        s2.displayGrade();  
    }
}
