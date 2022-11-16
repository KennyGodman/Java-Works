package Chapter7;

public class ArrayPractice {
        public static void main(String[] args) {
//            int[] numbers = new int[5];
           int [] numbers = {5, 3, 1,4,6};
            int highestNum=Integer.MIN_VALUE;
            int lowestNum= Integer.MAX_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] > highestNum){
                    highestNum = numbers[i];
                }
                if(numbers[i] < lowestNum){
                    lowestNum = numbers[i];
                }
            }

            System.out.printf("%s%d%n","The highest num is :", highestNum);
            System.out.printf("%s%d%n", "The lowest num is :", lowestNum);
        }
        }
