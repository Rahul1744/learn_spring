package org.example.prgm10;

// Java Program to Illustrate Spring SPEL Variable Example

// Importing required classes
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

// Class
public class App {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating MultiplicationTest object.
        MultiplicationTest multiplicationTest = new MultiplicationTest();

        // Creating StandardEvaluationContext object
        // with MultiplicationTest object.
        StandardEvaluationContext context = new StandardEvaluationContext(multiplicationTest);

        // Creating a parser with default settings.
        ExpressionParser parser = new SpelExpressionParser();

        // Setting variables values
        parser.parseExpression("num1").setValue(context, "30");
        parser.parseExpression("num2").setValue(context, "30");

        // Calculate result
        System.out.println(multiplicationTest.multiplication());
    }
}

