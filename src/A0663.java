import java.util.Scanner;

public class A0663 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1 = 1, f2 = 1;
        if (n < 2) {
            System.out.println(1);
            return;
        }
        int x = 0;
        for (int i = 2; i <= n; i++) {
            int f3 = (f1 + f2) % 10;
            f1 = f2;
            f2 = f3;
            x = f3;
        }
        System.out.println(x % 10);

    }
}
