import java.util.Scanner;
public class A0125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = sc.nextInt();
        }
        int bad = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i][j] ==1 && color[i] != color[j]) bad++;
            }
        }
        System.out.println(bad);
    }
}
