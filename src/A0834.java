import java.util.Locale;
import java.util.Scanner;

public class A0834 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double r = sc.nextDouble();
        double l = Math.hypot(x1 - x2, y1 - y2); // sqrt((x1-x2)^2 + (y1-y2)^2)
        double r2 = r * r, l2 = l * l;
        double j = (r >= l) ? r2 * Math.PI : r2 * (Math.PI - Math.acos(r / l)) + r * Math.sqrt(l2 - r2);
        System.out.printf("%.5f", j);

    }
}
