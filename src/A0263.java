import java.util.Scanner;

public class A0263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = n - b + a - 1;
        int y = b - a - 1;
        if (b > a) {
            System.out.println(Math.min(x, y));
        } else {
            int z = a - b - 1;
            int k = n - a + b - 1;
            System.out.println(Math.min(z, k));
        }
    }
}
