package chapter5;

public class Series {
    public static void main(String[] args) {
        System.out.printf("%s%10s%10s%n", "N", "Sum", "Product");
        long sum =  1;
        long product= 1;
        int i;
        for (i = 1; i <= 100; ++i) {
            sum += i;
            product = product * i;
            System.out.printf("%d%10d%10d%n", i,  sum,product);
        }

    }

}
