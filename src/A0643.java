import java.util.Scanner;

public class A0643 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int s = 0;
        while (n > 0) {
            s += n % 2;
            n /= 2;
        }
        System.out.println(a + s);
    }
}
