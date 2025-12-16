import java.util.Locale;
import java.util.Scanner;
public class A0922 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt(), t2 = sc.nextInt();
        int s1 = sc.nextInt(), s2 = sc.nextInt();
        int s = sc.nextInt();

        if (s <= s1) {
            double t = (double) s * t1 / s1;
            System.out.printf("%.2f\n", t);
        } else if (s1 <= s2) {
            System.out.println("NO");
        } else {
            int d = s1 - s2;
            long k = (s - s1) / d;
            double t = k * (t1 + t2) + (double)(s - k * d) / s1 * t1;
            System.out.printf("%.2f\n", t);
        }
    }
}