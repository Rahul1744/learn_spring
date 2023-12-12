package org.example.prgm3;

public class Student {
    // Class data members
    private int id;
    private MathCheat mathCheat;

    // Constructor of Student class
    public Student(int id, MathCheat mathCheat)
    {
        this.id = id;
        this.mathCheat = mathCheat;
    }

    // Method
    public void cheating()
    {
        System.out.println("My ID is: " + id);
        mathCheat.mathCheating();
    }
}
