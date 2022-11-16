package chapter6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year ::");
        int leap = scanner.nextInt();
        int isLeap = 346;
        if (leap == isLeap){
            System.out.println("It is a leap year");
        }
        else if (leap > isLeap){
            System.out.println("Leap entered is too high");
        }
        else {
            System.out.println("Leap entered is too low");
        }
    }
}
