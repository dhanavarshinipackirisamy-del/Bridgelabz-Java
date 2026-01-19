package CoreProgramming.ProgrammingElements.Level2;

import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("From city: ");
        String fromCity = input.nextLine();

        System.out.print("Via city: ");
        String viaCity = input.nextLine();

        System.out.print("To city: ");
        String toCity = input.nextLine();

        System.out.print("Distance from to via (miles): ");
        double d1 = input.nextDouble();

        System.out.print("Distance via to final (miles): ");
        double d2 = input.nextDouble();

        System.out.print("Time taken (hours): ");
        double time = input.nextDouble();

        double totalDistance = d1 + d2;

        System.out.println(
                name + " travelled from " + fromCity + " via " + viaCity +
                        " to " + toCity + ". Total distance is " + totalDistance +
                        " miles in " + time + " hours."
        );
    }
}
