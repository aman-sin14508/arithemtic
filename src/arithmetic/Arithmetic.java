/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/**
 * This class calls the method to perform arithmetic operations based on user input
 * Execute the code check the output.
 * @author sivagamasrinivasan
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);

        System.out.println("Select an operation (1 for PLUS, 2 for MINUS, 3 for TIMES, 4 for DIVIDE):");
        int choice = in.nextInt();
        ArithmeticBase.Operation op;

        switch (choice) {
            case 1:
                op = ArithmeticBase.Operation.PLUS;
                break;
            case 2:
                op = ArithmeticBase.Operation.MINUS;
                break;
            case 3:
                op = ArithmeticBase.Operation.TIMES;
                break;
            case 4:
                op = ArithmeticBase.Operation.DIVIDE;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation selected.");
        }

        System.out.println("Enter first number:");
        double n = in.nextDouble();
        System.out.println("Enter second number:");
        double m = in.nextDouble();

        double result = r.calculate(n, m, op);
        System.out.println("Result: " + result);
    }
}
