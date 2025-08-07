import java.util.Scanner;

public class A0010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        for (int i = -100; i <= 100; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
