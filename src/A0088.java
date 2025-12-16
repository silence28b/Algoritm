import java.util.*;
public class A0088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = n * n;
        int[][] sd = new int[l][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                sd[i][j] = sc.nextInt();
                if (sd[i][j] < 1 || sd[i][j] > l) {
                    System.out.println("Incorrect");
                    return;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            boolean[] bomi = new boolean[l+1];
            for (int j = 0; j < l; j++) {
                if (bomi[sd[i][j]]) {
                    System.out.println("Incorrect");
                    return;
                }
                bomi[sd[i][j]] = true;
            }
        }
        for (int j = 0; j < l; j++) {
            boolean[] bomi = new boolean[l+1];
            for (int i = 0; i < l; i++) {
                if (bomi[sd[i][j]]) {
                    System.out.println("Incorrect");
                    return;
                }
                bomi[sd[i][j]] = true;
            }
        }
        for (int bi = 0; bi < n; bi++) {
            for (int bj = 0; bj < n; bj++) {
                boolean[] bomi = new boolean[l+1];
                for (int i = bi*n; i < (bi+1)*n; i++) {
                    for (int j = bj*n; j < (bj+1)*n; j++) {
                        if (bomi[sd[i][j]]) {
                            System.out.println("Incorrect");
                            return;
                        }
                        bomi[sd[i][j]] = true;
                    }
                }
            }
        }
        System.out.println("Correct");
    }
}