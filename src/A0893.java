import java.util.Scanner;

public class A0893 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(n);
        } else {
            System.out.println(n * (n - 1) * (n - 2));
        }
    }
}
