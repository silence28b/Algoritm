import java.util.Scanner;

public class A0888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        long b = 3;
        long ball = 0;
        for (int i = 0; i < n; i++) {
            if (m[i] == 1) {
                ball += b;
                b++;
            } else {
                b = Math.max(3, b-3);
            }
        }
        System.out.println(ball);
    }
}
