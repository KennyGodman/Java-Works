package Chapter7;

public class ArrayPractice5 {
        public static void main(String[] args) {
            int[] number = new int[10];
            number[0] = 3;
            number[1] = 5;
            number[2] = 8;
            number[3] = 9;
            number[4] = 8;
            number[5] = 4;
            number[6] = 2;
            number[7] = 4;
            number[8] = 7;
            number[9] = 6;

            //EVEN NUMBER
            int counter1 = 0;
            for (int i = 0; i < number.length; i++) {
                if(number[i] % 2 == 0){
                    System.out.println(number[i]);
                    counter1++;
                }
            }
            System.out.println("there are "+counter1+ " even numbers in array number");

            // ODD NUMBER
            int counter2 = 0;
            for (int i = 0; i < number.length; i++) {
                if (number[i] % 2 == 1) {
                    System.out.println(number[i]);
                    counter2++;
                }
            }
            System.out.println("there are " + counter2 + " odd numbers in array number");

        }
}





