import java.util.Locale;
import java.util.Scanner;

public class A0876 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double r = sc.nextDouble();
        double n = Math.hypot(a, b);
        double fmax = r * n;
        double x0 = (n == 0.0) ? 0.0 : r * a / n;
        double y0 = (n == 0.0) ? 0.0 : r * b / n;
        System.out.printf("%.12f%n", fmax);
        System.out.printf("%.12f %.12f%n", x0, y0);

    }
}
