import java.util.Arrays;
import java.util.Scanner;

public class A0967 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int s1 = xs(a, k1);
            int s2 = xs(a, k2);
            b[i] = s1 * s2;
        }
        Arrays.sort(b);
        for (int y : b) {
            System.out.print(y + " ");
        }

    }

    static int xs(int x, int k) {
        int sum = 0;
        while (x > 0) {
            sum += x % k;
            x /= k;
        }
        return sum;
    }
}
