import java.util.Scanner;

public class A0051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String un = sc.next();
        int l = un.length();
        long sum = 1;
        for (int i = n; i > 0; i -= l) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
