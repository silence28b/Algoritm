import java.util.Scanner;
public class A0027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        boolean[][] bg = new boolean[w][h];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    bg[x][y] = true;
                }
            }
        }
        int bm = 0;
        for (int x = 0; x < w; x++) {
            for (int y = 0; y < h; y++) {
                if (!bg[x][y]) bm++;
            }
        }
        System.out.println(bm);
    }
}
