import java.util.Scanner;

public class A0294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        double a = x1 - x1 * ((double) y1 / 100);
        double b = x2 - x2 * ((double) y2 / 100);

        double zarar1 = x1 * ((double) y1 / 100) * z1;
        double zarar2 = x2 * ((double) y2 / 100) * z2;
        double sum = zarar1 + zarar2;


        if (a > b) {
            System.out.println((int)(sum + (a - b) * z1));
        } else if (a < b) {
            System.out.println((int)(sum + (b - a) * z2));
        } else {
            System.out.println((int)sum);
        }

    }
}
