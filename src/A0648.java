import java.util.Arrays;
import java.util.Scanner;

public class A0648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i]=sc.nextInt();
        }
        Arrays.sort(s);
        int d =0;
        int g = 0;
        for (int i = 0; i < n/2; i++) {
            d+=s[i];
            g+=s[n-i-1];
        }
        System.out.println(g-d);
    }
}
