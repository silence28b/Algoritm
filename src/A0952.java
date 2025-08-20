import java.util.Scanner;

public class A0952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = 0;
        int max = 0;
        if (n == 0 && m != 0) {
            System.out.println("Impossible");
        } else if (n == 0) {
            System.out.println(min + " " + max);
        } else {
            if (m == 0) {
                min = n;
                max = n;
            } else if (n >= m) {
                min = n;
                max = n + m - 1;
            } else {
                min = m;
                max = n + m - 1;
            }
            System.out.println(min + " " + max);
        }
    }
}


