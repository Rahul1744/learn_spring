package org.example.prgm8.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    @Autowired
    private Address address;

    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
//        System.out.println("Setter Injection");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", studentName='" + studentName + '\'' +
                '}';
    }

//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }

}
