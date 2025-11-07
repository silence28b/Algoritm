import java.util.Arrays;
import java.util.Scanner;

public class A0098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int chap = 0;
        int ong = n - 1;
        int[] sum = new int[2];
        int index = 0;
        while (chap <= ong) {
            int val;
            if (s[chap] >= s[ong]) {
                val = s[chap];
                chap++;
            } else {
                val = s[ong];
                ong--;
            }
            sum[(index++) % 2] += val;
        }
        System.out.println(sum[0] + ":" + sum[1]);


    }
}
