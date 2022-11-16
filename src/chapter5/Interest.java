package chapter5;

public class Interest {
    public static void main(String[] args) {

        double amount;
        double principal = 1000;
        double rate = 0.05;
        double total= 0;
        System.out.printf("%s %s %n", "Year","Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            amount = principal * Math.pow(1.0 + rate, year);
            total +=amount;
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
        System.out.printf("%s %.2f", "The total amount is : ", total);
    }
}
