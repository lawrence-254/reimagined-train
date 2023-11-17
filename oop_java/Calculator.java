package oop_java;

import java.util.Scanner;

class Calculations {

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int times(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int remainder(int num1, int num2) {
        return num1 % num2;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select 1 for addition");
        System.out.println("Select 2 for subtraction");
        System.out.println("Select 3 for multiplication");
        System.out.println("Select 4 for division");
        System.out.println("Select 5 for modulus");

        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);
        System.out.print("The first number: ");
        String num1 = scanner.nextLine();

        System.out.print("The second number: ");
        String num2 = scanner.nextLine();

        Calculations calc = new Calculations();
        int numA = Integer.parseInt(num1);
        int numB = Integer.parseInt(num2);
        int choice = Integer.parseInt(userInput);
        int result = 0;
        switch (choice) {
            case 1:
                result = calc.plus(numA, numB);
                break;
            case 2:
                result = calc.minus(numA, numB);
                break;
            case 3:
                result = calc.times(numA, numB);
                break;
            case 4:
                result = calc.divide(numA, numB);
                break;
            case 5:
                result = calc.remainder(numA, numB);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }

}
