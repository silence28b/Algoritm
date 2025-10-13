import java.util.Scanner;

public class A0700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        int k = sc.nextInt();
        long sum = v;
        long a = k;
        int i = 1;

        while (i < n && a < v) {
            sum = sum + v - a;
            a += k;
            i++;
        }

        if (i == n ) {
            System.out.printf("YES %s", sum);
        } else {
            System.out.printf("NO %s", sum);
        }
    }
}
