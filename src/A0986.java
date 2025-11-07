import java.util.Scanner;

public class A0986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int l = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tx = sc.nextInt();
            int ty = sc.nextInt();
            if (Math.pow(X - tx, 2) + Math.pow(Y - ty, 2) <= l * l) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("Yes");
    }
}
