import java.util.Scanner;

public class A0052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = n % 10;
        int a2 = ( n / 10) % 10;
        int a3 = (n / 100) % 10;
        int a4 = (n / 1000) % 10;
        int a5 = (n / 10000) % 10;
        int a6 = (n / 100000) % 10;
        if ( a1 + a2+ a3 == a4+ a5 + a6){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
