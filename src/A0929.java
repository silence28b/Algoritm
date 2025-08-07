import java.util.Scanner;

public class A0929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long max = n * 6;
        long min = n / 6;
        if (n % 6 != 0) {
            min += 7 - n % 6;
        }
        System.out.println(min + " " + max);
    }
}
