import java.util.Scanner;

public class timssort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] vaqt = new int[n][3];
        for (int i = 0; i < n; i++) {
            vaqt[i][0] = sc.nextInt();
            vaqt[i][1] = sc.nextInt();
            vaqt[i][2] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (compare(vaqt[j], vaqt[j + 1]) > 0) {
                    int [] temp = vaqt [j];
                    vaqt[j] = vaqt[j+1];
                    vaqt[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vaqt[i][0] + " " + vaqt[i][1] + " " + vaqt[i][2]);
        }
    }
    private static int compare ( int[] a, int[] b){
        if (a[0] == b[0]) {
            if (a[1] == b[1]) {
                return a[2] - b[2];
            }
            return a[1] - b[1];
        }
        return a[0] - b[0];
    }
}
