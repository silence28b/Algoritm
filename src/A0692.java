import java.util.Scanner;

public class A0692 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("NO");
            return;
        }


        while (n % 2 == 0) {
            n=n/2;
        }

        if (n==1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
