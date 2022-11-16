package chapter5;

public class Pattern {

        public static void main(String[] args) {
            for (int row = 1; row <= 6; row++) {
                for (int column = 1; column <= row; column++) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
            System.out.println();

            for(int row =6; row>=1; row--){
                for(int column= 1; column<= row; column++){
                    System.out.print(column + " ");
                }
                System.out.println();
            }

            System.out.println();

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



