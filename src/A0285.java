import java.util.Arrays;
import java.util.Scanner;

public class A0285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);
        int t = 0;
        for (int i = 0; i < n-1; i++) {
            t= t+time[i] -1;
        }
        int tt = t+time[n-1];
        if (time[n-1]>m || tt < m){
            System.out.println("no");
        }else {
            System.out.println("yes");
        }

    }
}
