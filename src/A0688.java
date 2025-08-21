import java.util.Scanner;

public class A0688 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xs = sc.nextInt();
        int ys = sc.nextInt();
        int xi = sc.nextInt();
        int yi = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (2 * length(xs, ys, x, y) <= length(xi, yi, x, y)) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("NO");

    }


    public static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

    }
}
