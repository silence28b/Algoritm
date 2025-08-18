import java.util.Scanner;

public class A0264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int hot = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                hot++;
                if (hot > max) {
                    max = hot;
                }
            } else {
                hot = 0;
            }
        }
        System.out.println(max);
    }
}
