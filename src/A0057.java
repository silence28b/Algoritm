import java.util.Scanner;
public class A0057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        long p = sc.nextLong();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int xn = sc.nextInt(), yn = sc.nextInt();
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            double l = distance(xn, yn, x[i], y[i]);
            for (int j = 0; j < n; j++) {
                l += distance(x[i], y[i], x[j], y[j]);
            }
            min = Math.min(min, l);
        }
        double narx = min * c;
        if (narx <= p) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    static double distance(int x1, int y1, int x2, int y2) {
        int dx = x1 - x2;
        int dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
