package ClassWork;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.println("Enter any integer denominator");
        int denominator = scanner.nextInt();
        int result =  (numerator / denominator);
        System.out.printf("Result is: %d %d%n %d", numerator,denominator,result);
    }
}
