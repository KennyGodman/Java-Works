package Chapter7;

public class Practice {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 1, 5, 8, 3};
        int highestNum = Integer.MIN_VALUE;
       int lowestNum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highestNum) {
                highestNum = numbers[i];
            }
        if(numbers[i] < lowestNum){
            lowestNum = numbers[i];
        }
        }
        System.out.printf("%s%d%n", "The highest num is :", highestNum);
        System.out.printf("%s%d%n", "The lowest num is :", lowestNum);

    }

}
