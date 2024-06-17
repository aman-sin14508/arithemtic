/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 * This class takes input from user and execute the arithmetic operation
 * Changed the code to use enum instead of String.
 * Advantage of using enum: Enhances type safety, readability, and maintainability.
 * @author sivagamasrinivasan
 */
public class ArithmeticBase {
    public enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }

    public double calculate(double x, double y, Operation op) {
        switch (op) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                return x / y;
            default:
                throw new AssertionError("Unknown operation " + op);
        }
    }
}
