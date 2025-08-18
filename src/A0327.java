import java.util.Scanner;

public class A0327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String t = sc.next();
            if (funksiya(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    public static boolean funksiya(String t) {
        int tk = Integer.parseInt(t);
        int a1 = (tk - 1) % 10;
        int a2 = ((tk - 1) / 10) % 10;
        int a3 = ((tk - 1) / 100) % 10;
        int a4 = ((tk - 1) / 1000) % 10;
        int a5 = ((tk - 1) / 10000) % 10;
        int a6 = ((tk - 1) / 100000) % 10;

        int b1 = (tk + 1) % 10;
        int b2 = ((tk + 1) / 10) % 10;
        int b3 = ((tk + 1) / 100) % 10;
        int b4 = ((tk + 1) / 1000) % 10;
        int b5 = ((tk + 1) / 10000) % 10;
        int b6 = ((tk + 1) / 100000) % 10;
        return a1 + a2 + a3 == a4 + a5 + a6 || b1 + b2 + b3 == b4 + b5 + b6;

    }

}
