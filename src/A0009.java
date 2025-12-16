import java.util.Arrays;
import java.util.Scanner;
public class A0009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] son = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0) sum+=x;
            son[i] = x;
        }
        int minVal = son[0], maxVal = son[0];
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (son[i] < minVal) { minVal = son[i]; minIdx = i; }
            if (son[i] > maxVal) { maxVal = son[i]; maxIdx = i; }
        }
        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);
        int kop = 1;
        for (int i = left+1; i < right; i++) kop *= son[i];

        System.out.println(sum+" "+kop);

    }
}
