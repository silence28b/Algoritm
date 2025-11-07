import java.util.Arrays;
import java.util.Scanner;

public class A0912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[101];
        for (int i = 0; i < n; i++) {
            int color = sc.nextInt();
            count[color]++;
        }
        int maxCount = 0;
        for (int i = 1; i <= 100; i++) {
            maxCount = Math.max(maxCount, count[i]);
        }
        int maxColor = 0;
        boolean multiple = false;
        for (int i = 1; i <= 100; i++) {
            if (maxCount == count[i]) {
                if (maxColor == 0) {
                   maxColor=i;
                }else {
                    multiple = true;
                    break;
                }
            }
        }
        System.out.println(multiple ? 0 : maxColor);

    }
}
