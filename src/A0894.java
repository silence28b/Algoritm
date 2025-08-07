import java.util.Locale;
import java.util.Scanner;

public class A0894 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double R1 = sc.nextDouble();
        double R2 = Math.sqrt((R1 * R1) - s / Math.PI);
        System.out.println(R2);
    }
}
