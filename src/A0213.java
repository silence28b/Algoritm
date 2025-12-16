import java.util.Scanner;
public class A0213 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bal = new int[n];
        for (int i = 0; i < n; i++) {
            bal[i] = sc.nextInt();
        }
        int gift = sc.nextInt();
        int m = sc.nextInt();
        int[][] test = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                test[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int sum=0;
        for (int i = 0; i < n; i++) sum+=bal[i];
        for (int i = 0; i < m; i++) {
            int ball = 0;
            for (int j = 0; j < n; j++) {
                int x = test[i][j];
                ball += x*bal[j];
            }
            if (ball==sum) ball += gift;
            int fall = 2*i;
            ball-=fall;
            max = Math.max(max, ball);
            System.out.println(max);
        }
    }
}
