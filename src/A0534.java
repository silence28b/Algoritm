import java.util.Scanner;

public class A0534 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            count[x-1] -= 1;
        }
        for (int i = 0; i < n; i++) {
            if (count[i] < 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }
}
