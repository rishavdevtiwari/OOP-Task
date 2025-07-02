// 2. Write a Java program for a basic course registration system:
// ● Define a class Course with courseId, courseName, and instructor.
// ● Allow registering multiple courses using an ArrayList.
// ● Display all registered courses in a formatted output

import java.util.ArrayList;

class Course {
    String courseId, courseName, instructor;
    
    Course(String id, String name, String instructor) {
        this.courseId = id;
        this.courseName = name;
        this.instructor = instructor;
    }
    
    @Override
    public String toString() {
        return courseId + " | " + courseName + " (Instructor: " + instructor + ")";
    }
}

public class MainQ2 {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("CS101", "Java", "Dr. Smith"));
        courses.add(new Course("MATH202", "Calculus", "Prof. Lee"));
        
        System.out.println("Registered Courses:");
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}