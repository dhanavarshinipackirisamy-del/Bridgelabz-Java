package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class PoundToKg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        double kg = pounds / 2.2;

        System.out.println(
                "The weight of the person in pound is " + pounds +
                        " and in kg is " + kg
        );
    }
}
