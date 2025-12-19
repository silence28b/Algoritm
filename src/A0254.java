import java.util.Scanner;

public class A0254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r  = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[][] tp = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                tp[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (r[i]==tp[j][0]){
                    r[i]=tp[j][1];
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(r[i]+" ");
        }
    }
}
