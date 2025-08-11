import java.util.Scanner;

public class A0685 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int max1 = max(a1, a2, a3);
        int min1 = min(a1, a2, a3);
        int mid1 = a1 + a2 + a3 - max1 - min1;
        int max2 = max(b1, b2, b3);
        int min2 = min(b1, b2, b3);
        int mid2 = b1 + b2 + b3 - max2 - min2;
        System.out.println(max1 * max2 + mid1 * mid2 + min1 * min2);

    }

    public static int max(int a, int b, int c) {
        return Math.max(c, Math.max(a, b));
    }

    public static int min(int a, int b, int c) {
        return Math.min(c, Math.min(a, b));

    }
}
