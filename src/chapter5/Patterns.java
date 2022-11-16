package chapter5;

public class Patterns {

        public static void main(String[] args) {

            pattern1(5);
            pattern(5);
            pattern2(5);
        }

        static void pattern(int x) {
            for (int row = 1; row <= x; row++) {

                for (int spaces = 0; spaces < x - row; spaces++) {
                    System.out.print(" ");
                }
                for (int column = row; column >= 1; column--) {
                    System.out.print(column + " ");
                }
                for (int column = 2; column <= row; column++) {
                    System.out.print(column + " ");
                }
                System.out.println();

            }
        }

        static void pattern1(int x) {
            for (int row = 0; row <= x; row++) {

                for (int spaces = 0; spaces < x - row; spaces++) {
                    System.out.print(" ");
                }
                for (int column = row; column >= 1; column--) {
                    System.out.print(row);
                }
                for (int column = 2; column <= row; column++) {
                    System.out.print(row);
                }
                System.out.println();

            }
        }

        static void pattern2(int x) {
            for (int row = 1; row <= x; row++) {

                for (int spaces = 0; spaces < x - row; spaces++) {
                    System.out.print(" ");
                }
                for (int column = row; column >= 1; column--) {
                    System.out.print("*");
                }
                for (int column = 2; column <= row; column++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

