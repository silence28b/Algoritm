import java.util.Locale;
import java.util.Scanner;

public class A0439 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        double x1 = (double) (100 - p) /100;
        double x2 = (double) p /100;
        double j = 1/(((double) 1 /n*x1)+x2);

        System.out.printf("%.9f",j);
    }
}
