package org.example.prgm8.constructor;

public class Student {
    private Address address;

    private String studentName;

    public Student() {}

    public Student(Address address, String studentName) {
        System.out.println("Constructor Injection.");
        this.address = address;
        this.studentName = studentName;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
//        System.out.println("Setter Injection");
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
