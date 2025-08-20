import java.util.Scanner;

public class A0015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int sum = 0;
        int no = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==1){
                    sum += 1;
                } else {
                    no += 1;
                }

            }
        }
        System.out.println(sum / 2);

    }
}
