import java.util.Scanner;

public class A0501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] u = new int[n][4];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt();
            int x2 = sc.nextInt(), y2 = sc.nextInt();
            u[i][0] = Math.min(x1, x2);
            u[i][1] = Math.min(x2, y2);
            u[i][2] = Math.max(x1, x2);
            u[i][3] = Math.max(x2, y2);
        }
        int a1 = sc.nextInt(), b1 = sc.nextInt();
        int a2 = sc.nextInt(), b2 = sc.nextInt();
        int lx = Math.min(a1, a2), ly = Math.min(b1, b2);
        int rx = Math.max(a1, a2), ry = Math.max(b1, b2);
        int tS = 0;
        for (int i = 0; i < n; i++) {
            int l = Math.max(lx, u[i][0]);
            int r = Math.min(rx, u[i][2]);
            int b = Math.max(ly, u[i][1]);
            int t = Math.min(ry, u[i][3]);
            if (l < r && b < t) {
                int s = (r - l) * (t - b);
                tS += s;
            }
        }
        System.out.println(tS);
    }
}
