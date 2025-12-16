import java.util.Scanner;
public class A0667 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        boolean extraBus = m % 2 == 1;
        int as = m / 2;
        if (k < 3) {
            System.out.println(0);
            return;
        }
        int bs = (n - 1) / (k - 2) + 1;
        if (m < 2 || as < bs) {
            System.out.println(0);
        } else {
            int qj = ((k - 2) - n % (k - 2)) % (k - 2);
            int qm = (as - bs) * 2;
            if (extraBus) qm++;
            qm -= qj;
            if (qm <= 0) System.out.println(bs);
            else System.out.println(bs + (qm - 1) / k + 1);
        }
    }
}
