import java.util.Scanner;

public class A0692_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        while (p < n) {
            p *= 2;
        }
        if (p == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
