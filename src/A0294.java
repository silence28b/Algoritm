import java.util.Scanner;

public class A0294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        int a = Math.abs(r1 - r2);
        int b = r1 + r2;
        if (d == b || d == a || ( a < d  &&  d< b )) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
