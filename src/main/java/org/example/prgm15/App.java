package org.example.prgm15;

// Java Program to Illustrate EmployeeTest Class


// Importing required classes
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Class
public class App {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of ApplicationContext,
        // EmployeeImpl, and Employee class inside main()
        // method
        ApplicationContext con = new ClassPathXmlApplicationContext("config15.xml");
        EmployeeImpl impl = (EmployeeImpl)con.getBean("impl");
        Employee emp = impl.createEmp();

        System.out.println("Employee Details");
        System.out.println("Name: " + emp.getName()
                + ", Email address: "
                + emp.getMail());
        ((ClassPathXmlApplicationContext)con).close();
    }
}

