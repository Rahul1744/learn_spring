package org.example.prgm10;

// Java Program to Illustrate MultiplicationTest Class

// Class
public class MultiplicationTest {
    // Class data members
    int num1;
    int num2;

    // Getter
    public int getNum1() { return num1; }

    // Setter
    public void setNum1(int num1)
    {
        // this keyword refers to current
        // instance itself
        this.num1 = num1;
    }

    // Getter
    public int getNum2() { return num2; }

    // Setter
    public void setNum2(int num2) { this.num2 = num2; }

    // Method
    // To multiply two numbers
    public int multiplication() { return num1 * num2; }
}

