import java.util.Arrays;
import java.util.Scanner;

public class A0234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        char[][] arr = new char[n][m];
        int[][] cnt = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }
        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt()-1, y = sc.nextInt()-1;
            arr[x][y] = '*';
            for (int d = 0; d < 8; d++) {
                int nx= x+ dx[d];
                int ny= y+ dy[d];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] != '*') {
                    cnt[nx][ny]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]=='*'){
                    System.out.print('*');
                } else if (cnt[i][j]>0) {
                    System.out.print(cnt[i][j]);
                }else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }
}
