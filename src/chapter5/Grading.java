package chapter5;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int total = 0;
        int grade = 0;
        double average = 0;
        while (gradeCounter < 5) {
            System.out.println("Please enter your grade within the range of 0 - 100 :");
            grade = scanner.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            switch (grade / 10) {
                case 9:
                case 10:
                    aCount++;
                    break;
                case 8:
                    bCount++;
                    break;
                case 7:
                    cCount++;
                    break;
                case 6:
                    dCount++;
                    break;
                case 5:
                    eCount++;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }

        }
               if (gradeCounter != 0) {
                average = (double) total / gradeCounter;
                System.out.println(average);
                System.out.printf("%s: %d%n%s: %d%n%s: %d%n%s: %d%n%s: %d%n :", "A", aCount, "B", bCount,
                        "C", cCount, "D", dCount, "E", eCount);
            } else {
                System.out.println("Pls enter fresh input");
            }
        }

    }

