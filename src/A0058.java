import java.util.Scanner;
public class A0058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test <t ; test++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            boolean gozal = true;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < m-1; j++) {
                    int x = a[i][j];
                    if (a[i][j + 1] == x && a[i + 1][j] == x && a[i + 1][j + 1] == x){
                        gozal = false;
                        break;
                    }
                }
                if (!gozal) break;
            }
            System.out.println(gozal ? "YES" : "NO");
        }
    }
}
