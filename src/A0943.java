import java.util.Scanner;

public class A0943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = i * m + j;
                } else {
                    arr[i][j] = i * m + m - 1 - j;
                }

                if (x - 1 == i && y - 1 == j) {
                    System.out.println(arr[i][j]);
                    break;
                }
            }
        }
    }
}
