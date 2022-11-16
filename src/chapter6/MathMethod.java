package chapter6;

public class MathMethod {
    public static void main(String[] args) {
        floorMethod(6.4);
        ceilMethod(6.4);


    }
    public static void floorMethod(double num){
        double result = (int) num;
        System.out.println(result);
    }
    public static void ceilMethod(double num){
        double newNum = (int) num + 1;
        System.out.println(newNum);
    }
}
