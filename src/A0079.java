import java.util.Scanner;
public class A0079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b = sc.nextInt();
        int a = x % 10;
        if (a == 1 || a == 5 || a == 6 || a==0) {
            System.out.println(a);
            return;
        }
        int[][] t = {{4, 6}, {9, 1}};
        int[][] f = {{2, 4, 8, 6}, {3, 9, 7, 1}, {7, 9, 3, 1}, {8, 4, 2, 6}};
        if (a == 4 || a == 9) {
            int q = b % 2;
            if (q == 0) q = 2;
            if (a == 4) {
                System.out.println(t[0][q - 1]);
            } else {
                System.out.println(t[1][q - 1]);
            }
        } else {
            int q = b % 4;
            if (q == 0) q = 4;
            if (a == 2) {
                System.out.println(f[0][q - 1]);
            } else if (a == 3) {
                System.out.println(f[1][q - 1]);
            } else if (a == 7) {
                System.out.println(f[2][q - 1]);
            } else if (a == 8) {
                System.out.println(f[3][q - 1]);

            }
        }
    }
}
