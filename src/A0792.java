import java.util.Scanner;

public class A0792 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();

        long s1 = 0;
        while (x1 >= y1) {
            long b1 = x1 / y1;
            s1 += x1%y1;
            x1 = b1;
        }

        long s2 = 0;
        while (x2 >= y2) {
            long b2 = x2 / y2;
            s2 += x2 % y2;
            x2 = b2;
        }

        if (s1 + x1 == s2 + x2) {
            System.out.println(s1+x1);
        } else {
            System.out.println(0);
        }

    }
}
