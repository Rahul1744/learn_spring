package org.example.prgm5.type2;


// Class
public class CourseFactory {

    // Method
    // factory method returning instance to another class
    public static GeeksCourses getCourses()
    {
        // Returning the instance of JavaCourses class
        // One can also return the instance of DSACourses
//        return new JavaCourses();
        return new DSACourses();
    }
}

