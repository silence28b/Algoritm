import java.util.Locale;
import java.util.Scanner;

public class A0411 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = b * b - 4.0 * a * c;
        double x = -1.0 * b / (2.0 * a);
        double y = -1.0 * c / b;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(1);
                System.out.printf("%.6f", y);
            }
        } else {
            if (d > 0) {
                double x1 = (-b - Math.sqrt(d)) / (2.0 * a);
                double x2 = (-b + Math.sqrt(d)) / (2.0 * a);
                double max = Math.max(x1, x2);
                double min = Math.min(x1, x2);

                System.out.println(2);
                System.out.printf("%.6f\n", min);
                System.out.printf("%.6f\n", max);
            } else if (d == 0) {
                System.out.println(1);
                System.out.printf("%.6f", x);
            } else {
                System.out.println(0);
            }
        }
    }
}
