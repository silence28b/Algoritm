import java.util.Scanner;

public class A0482 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] son = new int[n];
        int m = 1;
        int i = 1;

        go:
        while (i <= n) {
            for (int j = 1; j <= m; j++) {
                char[] charArray = String.valueOf(j).toCharArray();
                for (char c : charArray) {
                    if (i > n) break go;

                    son[i - 1] = c - '0';
                    i++;
                }
            }
            m++;
        }
        System.out.println(son[n - 1]);
    }
}
