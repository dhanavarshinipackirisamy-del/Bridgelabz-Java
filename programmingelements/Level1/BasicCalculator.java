package CoreProgramming.ProgrammingElements.Level1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double n1 = input.nextDouble();

        System.out.print("Enter number2: ");
        double n2 = input.nextDouble();

        System.out.println(
                "Addition: " + (n1 + n2) +
                        ", Subtraction: " + (n1 - n2) +
                        ", Multiplication: " + (n1 * n2) +
                        ", Division: " + (n1 / n2)
        );
    }
}
