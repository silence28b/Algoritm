import java.util.Scanner;

public class A0124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] son = new int[101];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            son[x]++;
            son[y]++;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(son[i] + " ");
        }

    }
}
