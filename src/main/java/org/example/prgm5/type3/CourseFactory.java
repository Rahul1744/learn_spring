package org.example.prgm5.type3;

public class CourseFactory {
    // Non-static factory method that returns
    // the instance to another class
    public GeeksCourses getCourses()
    {

        // Returning the instance of JavaCourses class
        // One can also return the instance of DSACourses
        return new DSACourses();
    }
}
