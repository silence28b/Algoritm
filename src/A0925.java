import java.util.Scanner;

public class A0925 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max((Math.max(a, b)), c);
        int min = Math.min((Math.min(a, b)), c);
        int sum = a + b + c;
        int mid = sum - (max + min);
        int nmax = n - max;
        int nmid = n - mid;

        if (k == 2) {
            System.out.println(min);
        } else {
            if (min - nmid - nmax > 0) {
                System.out.println(min - nmid - nmax);
                return;
            }
                System.out.println(0);


        }

    }
}
