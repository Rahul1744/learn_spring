package org.example.prgm8.bytype;

public class Student {
    private Address address;

    private String studentName;

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
