import java.util.Arrays;
import java.util.Scanner;

public class A0461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] gr = new int[k];
        for (int i = 0; i < k; i++) {
            int gos = sc.nextInt();
            gr[i]+=gos/2+1;
        }
        Arrays.sort(gr);
        int l = k/2+1;
        int ovoz = 0;
        for (int i = 0; i < l; i++) {
            ovoz+=gr[i];
        }
        System.out.println(ovoz);
    }
}
