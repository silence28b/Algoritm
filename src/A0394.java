import java.util.Scanner;

public class A0394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long g = eb(n, m);
        long k = n / g;
        System.out.println(k);
    }

    static long eb(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
