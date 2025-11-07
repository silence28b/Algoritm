import java.util.Locale;
import java.util.Scanner;

public class A0760 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int l = sc.nextInt();
        int [] arr = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            arr [i] = sc.nextInt();
        }
        double t = ((double) l /v)*60;
        for (int i = 1; i <2*n ; i+=2) {
            t+=arr[i];
        }
        System.out.printf("%.2f", t );

    }
}
