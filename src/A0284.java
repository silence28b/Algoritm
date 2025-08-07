import java.util.Scanner;

public class A0284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            for (int j = left - 1; j < right; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();

        }


    }
}
