import java.util.Scanner;

public class A0819 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = 2 * a * c + 2 * b * c + 2 * a * b;
        long v = a * b * c;
        System.out.println(s + " " + v);
    }
}
