package ClassWork;

import java.util.ArrayList;

//package ClassWork;
public class Factors {
    public static void main(String[] args) {
        System.out.println(factorY(6));
        System.out.println(isPrime(5));
    }

    public static int factorY(int num){
        int count = 0;
        for (int i = 1; i <= num ; i++) {
            if(num % i == 0){
                count++;
            }

        }
        return count;
    }

    public static boolean isPrime(int numbers) {
        boolean validation = false;

        if(Factors.factorY(numbers) == 2){
            validation = true;
        }
        return validation;
    }


//    public int factor(int i) {
//    }
}





//public class FactorOf {
//    public static void main(String[] args) {
//        FactorOf factor = new FactorOf();
//        int check = factor.
//        factor(6);
//        isPrime(6);
//    }
//
//    public static short factor(int num) {
//        int counter1 = 0;
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                counter1++;
//            }
//        }
//        return counter1;
//    }
//
//    public static boolean isPrime(int numbers) {
//        boolean result = false;
//
//            if (factors.fa() % 2 == 1) {
//                return true;
//            }
//            return false;
//        }
//    }
