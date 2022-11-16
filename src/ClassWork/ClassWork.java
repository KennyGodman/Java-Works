package ClassWork;

import java.util.Scanner;

public class ClassWork {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Number 1");
            int userInput = input.nextInt();
            int lowerNumber = userInput;
            int largerNumber = userInput;
            int count = 1;
            int total = userInput;
            int average;
            while (count < 5) {
                System.out.printf("Enter Number %d%n", count + 1);
                userInput = input.nextInt();
                if (userInput > largerNumber) {
                    largerNumber = userInput;
                }  if (userInput < lowerNumber) {
                    lowerNumber = userInput;
                }
                total += userInput;
                count = count + 1;
            }
            average = total / count;


            System.out.printf("The highest number is %d%n The lowest number is %d%n", largerNumber, lowerNumber);
            System.out.printf("The total is %d%n", total);
            System.out.printf("The average is %d%n", average);
        }
    }


