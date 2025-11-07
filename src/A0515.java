import java.util.Locale;
import java.util.Scanner;

public class A0515 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double l = 0;
        double x0 = 0;
        double y0 = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            l += Math.sqrt((Math.pow((x0-x),2)+Math.pow((y0-y),2)));
            x0 = x;
            y0 = y;
        }
        l += Math.sqrt(Math.pow((x0),2)+Math.pow((y0),2));
        System.out.printf("%.3f", l);

    }
}
