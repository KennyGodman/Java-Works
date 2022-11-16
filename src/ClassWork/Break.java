package ClassWork;

import java.util.Scanner;

public class Break {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter number 1 :");
            int number1 = input.nextInt();

            System.out.println("Enter number 2 :");
            int number2 = input.nextInt();

            System.out.println("Enter number 3: ");
            int number3 = input.nextInt();

            System.out.println("The Highest number is " + Math.max(number1, Math.max(number2, number3)));
            System.out.println("The Lowest number is " + Math.min(number1, Math.min(number2, number3)));

            int  average = (number1 + number2 + number3) / 3;
            System.out.printf("The average is %d%n", average);

            int sum = number1 + number2 + number3;
            System.out.printf("The sum is %d%n", sum);

            int product =number1 * number2 * number3;
            System.out.printf("The product is %d%n", product);
        }
    }


