import java.util.Scanner;

public class A0803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        int q = a%b;
        int d = 0;
        for (int i = 0; i < k; i++) {
            q*=10;
            d=q/b;
            q=q%b;
        }
        System.out.println(d);
    }
}
