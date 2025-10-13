import java.util.Locale;
import java.util.Scanner;

public class A0079_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.CANADA);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = n % 10;
        int s = m % 4 + 4;
        long x = (long) Math.pow(k, s);
        int oxiri = (int) (x % 10);
        System.out.println(oxiri);
    }
}
