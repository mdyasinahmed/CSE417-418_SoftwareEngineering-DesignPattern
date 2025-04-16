package MyPractice;

import java.io.*;
import java.util.*;

// Basic Java Concepts in One File
public class java_basics {

    // Variables and Data Types
    int num = 10;
    double decimalNum = 5.5;
    char letter = 'A';
    boolean isJavaFun = true;
    String text = "Hello, Java!";

    // Constructor
    public java_basics() {
        System.out.println("Constructor Executed!");
    }

    // Method (Function)
    public void greet() {
        System.out.println("Welcome to Java Basics!");
    }

    // Method with Parameters and Return Type
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Control Statements: If-Else
    public void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
    }

    // Switch Case Example
    public void dayOfWeek(int day) {
        switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            default: System.out.println("Invalid Day");
        }
    }

    // Loops: For Loop
    public void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }

    // While Loop
    public void whileLoopExample() {
        int count = 5;
        while (count > 0) {
            System.out.println("Count: " + count);
            count--;
        }
    }

    // Arrays
    public void arrayExample() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Array Element: " + num);
        }
    }

    // Exception Handling
    public void exceptionHandling() {
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    // File Handling
    public void fileHandling() {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, File!");
            writer.close();
            System.out.println("File Written Successfully!");
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }

    // Main Method
    public static void main(String[] args) {
        java_basics basics = new java_basics();
        basics.greet();
        System.out.println("Sum: " + basics.addNumbers(5, 10));
        basics.checkNumber(-5);
        basics.dayOfWeek(2);
        basics.printNumbers();
        basics.whileLoopExample();
        basics.arrayExample();
        basics.exceptionHandling();
        basics.fileHandling();
    }
}

