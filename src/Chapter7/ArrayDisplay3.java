package Chapter7;

public class ArrayDisplay3 {
        public static void main(String[] args) {

            String[][] array = {{"X", "O", "X"},
                    {"O", "X", "O"},
                    {"X", "X", "O"}};

            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[row].length; column++) {
                    System.out.print(array[row][column]);
                    if (column < array.length -1 ){
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
        }
    }
