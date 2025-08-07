import java.util.Scanner;

public class A0081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 30000;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            max = Math.max (max, m );
            min = Math.min(min, m);
        }
        System.out.println(min + " " + max);
    }
}
