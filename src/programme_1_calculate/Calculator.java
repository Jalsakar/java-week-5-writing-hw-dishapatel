package programme_1_calculate;

public class Calculator {
    //method to calculate addition
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
    }

    //method to calculate subtraction
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is : " + (a - b));
    }

    //method to calculate multiplication
    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
    }

    //method to calculate division
    public void division(int a, int b) {
        System.out.println("Division of " + a + " and " + b + " is :" + (a / b));
    }

    //method to calculate a result
    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            addition(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '*') {
            multiplication(a, b);
        } else if (symbol == '/') {
            division(a, b);
        } else {
            System.out.println("Invalid input !!!");//warning msg for an invalid entry
        }
    }
}