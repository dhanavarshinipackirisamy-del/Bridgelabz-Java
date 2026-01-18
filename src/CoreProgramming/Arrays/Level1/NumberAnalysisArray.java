package CoreProgramming.Arrays.Level1;

import java.util.Scanner;

public class NumberAnalysisArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int n : numbers) {
            if (n > 0) {
                if (n % 2 == 0)
                    System.out.println(n + " is Positive Even");
                else
                    System.out.println(n + " is Positive Odd");
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] == numbers[4])
            System.out.println("First and last elements are equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is greater than last");
        else
            System.out.println("First element is less than last");
    }
}
