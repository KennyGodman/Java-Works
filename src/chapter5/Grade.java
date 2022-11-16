package chapter5;

import java.util.Scanner;

public class Grade {
        public static void main(String[] arg){
            Scanner c = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
            System.out.println("Enter your Grade :");
            int grade = c.nextInt();

            if ( grade >= 80) {
                System.out.println("Print A");
            }
            if (grade > 70 && grade < 80) {
                System.out.println("Print B");
            }
            if (grade > 60 && grade <= 70 ) {
                System.out.println("Print C");
            }
            if (grade >= 40  && grade <= 60) {
                System.out.println("Print D");
            }
            if (grade >= 0 && grade < 40) {
                System.out.println("Print F");
            }
            }
        }

    }

