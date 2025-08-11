import java.util.Scanner;

public class A0106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int one = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        System.out.println(Math.min(one, zero));
    }
}
