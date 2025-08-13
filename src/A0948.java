import java.util.Scanner;

public class A0948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (b + a - 1) / a;
        int d = b % a;
        if (d == 0) {
            System.out.println(c + " " + a);
        } else {
            System.out.println(c + " " + d);
        }
    }
}
