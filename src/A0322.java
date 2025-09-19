import java.util.Scanner;

public class A0322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int f1 = 0, f2 = 1;
        while (f2 <= n.length()) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

            if (f2 <= n.length())
                System.out.print(n.charAt(f2 - 1));
        }
        System.out.println();
    }
}
