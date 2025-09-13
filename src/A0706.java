import java.util.Locale;
import java.util.Scanner;

public class A0706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.CANADA);
        double r = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double s = Math.abs((r * x) / (2 * r - y));
        System.out.printf("%.2f", s);

    }
}
