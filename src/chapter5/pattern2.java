package chapter5;

public class pattern2 {

        public static void main(String[] args) {
            for (int row = 1; row <= 6; row++) {
                for (int column =row; column <=6; column++) {
                    System.out.print("  ");
                }
                for (int column = row; column >= 1; column--) {
                    System.out.print(column +" ");
                }
                System.out.println();
            }

        }
    }


