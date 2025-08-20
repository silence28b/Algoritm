import java.util.Scanner;

public class A0949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fn = a, fn1 = b;
        int f = b - a;
        for (int i = 4; i > 1; i--) {
            f = fn1 - fn;
            fn1 = fn;
            fn = f;
        }
        System.out.println(fn + " " + fn1);
    }
}
