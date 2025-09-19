import java.util.Scanner;

public class A0493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] w = new char[n][m];
        for (int i = 0; i < n; i++) {
            w[i] = sc.next().toCharArray();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (w[i][j] == '.') {
                    if ((i - 1 < 0 || w[i - 1][j] != '*') &&
                            (j - 1 < 0 || w[i][j - 1] != '*') &&
                            (j + 1 >= m || w[i][j + 1] != '*') &&
                            (i + 1 >= n || w[i + 1][j] != '*')) {
                        sum++;

                    }
                }
            }
        }
        System.out.println(sum);

    }
}
