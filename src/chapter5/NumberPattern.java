package chapter5;

public class NumberPattern {

        public static void main(String[] args) {
            pattern(5);
        }
        static void pattern(int x) {
            for (int row = 1; row <= x; row++) {

                for (int spaces = 0; spaces < x - row; spaces++) {
                    System.out.print("* ");
                }
                for (int column = row; column >= 1 - row; column--) {
                    System.out.print(column + " ");
                }
                for (int column = 2; column <= row; column++) {
                    System.out.print(column + " ");
                }
                System.out.println();

            }
        }
    }
