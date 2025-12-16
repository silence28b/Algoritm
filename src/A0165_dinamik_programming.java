import java.util.Scanner;

public class A0165_dinamik_programming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] s = new int[n][m];
        long[][] dp = new long[n][m]; // yo‘llar soni — katta bo‘lishi mumkin

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                s[i][j] = sc.nextInt();

        dp[0][0] = 1; // boshlang‘ich nuqta

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int step = s[i][j];
                if (dp[i][j] == 0 || step == 0) continue;

                if (i + step < n)
                    dp[i + step][j] += dp[i][j];

                if (j + step < m)
                    dp[i][j + step] += dp[i][j];
            }
        }
        System.out.println(dp[n - 1][m - 1]);
    }
}
