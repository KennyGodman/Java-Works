package Chapter7;

public class Practice2 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 5, 8, 3};
        maximum(numbers);
        minimum(numbers);
        sortMaxAndMin(numbers);
    }

    public static int maximum(int[] numbers) {
        int highestNum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highestNum) {
                highestNum = numbers[i];
            }

        }
        return highestNum;
    }
    public static int minimum(int[] numbers) {
        int lowestNum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < lowestNum){
                lowestNum = numbers[i];
            }
        }
       return lowestNum;

    }
 public static int [] sortMaxAndMin(int [] numbers){
        int[] newArray = new int[numbers.length];
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
     for (int i = 0; i < numbers.length; i++) {
         for (int j = 0; j < numbers.length; j++) {
             total += numbers[i];
         }
         for (int k = 0; k < numbers.length; k++) {
             newArray[k] = total - numbers[k];
             k++;
         }
         for (int l = 0; l < newArray.length; l++) {
             if(newArray[l] > max){
                 max = newArray[l];
             }
             if(newArray[l] < min){
                 min = newArray[l];
             }
         }
     }
     System.out.println("The max in the array is" + max);
     System.out.println("The min in the array is" + min);
     return newArray;
 }
}
