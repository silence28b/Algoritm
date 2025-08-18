import java.util.Scanner;

public class A0817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        long k = sc.nextLong();
        long s = (n+m)*d*k - n*m*d*d;
        System.out.println(s);
    }
}
