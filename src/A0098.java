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
        long sum1 = 0;
        long sum2 = 0;
        boolean birinchi_player = true;
        while (chap <= ong) {
            int val;
            if (s[chap] >= s[ong]) {
                val = s[chap];
                chap++;
            } else {
                val = s[ong];
                ong--;
            }
            if (birinchi_player) {
                sum1 += val;
            } else {
                sum2 += val;
            }
            birinchi_player = !birinchi_player;
        }
        System.out.println(sum1 + ":" + sum2);


    }
}
