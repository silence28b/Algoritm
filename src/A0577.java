import java.util.Scanner;

public class A0577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] count = new int[10];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int p = i * j;


                while (p > 0) {
                    count[p % 10]++;
                    p /= 10;

                }

            }

        }
        for (int k = 0; k <= 9; k++) {
            System.out.println(count[k]);

        }

    }
}
