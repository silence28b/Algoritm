import java.util.Locale;
import java.util.Scanner;

public class A0409 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] balandlik = new int[n];
        for (int i = 0; i < n; i++) balandlik[i] = sc.nextInt();
        double umumiy_yuza = 0;
        for (int i = 0; i < n - 1; i++) {
            umumiy_yuza += (balandlik[i] + balandlik[i + 1]) / 2.0;
        }
        double h = umumiy_yuza / (n - 1);
        System.out.printf("%.10f", h);
    }
}
