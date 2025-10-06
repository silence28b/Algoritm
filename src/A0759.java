import java.util.Arrays;
import java.util.Scanner;

public class A0759 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        Arrays.sort(q);
        int sum = 0;
        int coutn = 1;
        for (int i = n - 1; i >= 0 && coutn <= m; i--) {
            if (q[i] > 0) {
                sum += q[i];
                coutn++;
            }else {
                break;
            }
        }
        System.out.println(sum);
    }
}
