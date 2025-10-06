import java.util.Scanner;

public class A0276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int b = x / y;
        int q = x % y;
        for (int i = 0; i < y - q; i++) {
            System.out.print(b + " ");
        }
        for (int i = 0; i < q; i++) {
            System.out.print((b + 1) + " ");
        }
    }
}
