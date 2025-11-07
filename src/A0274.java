import java.util.Scanner;

public class A0274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char[] one = sc.next().toCharArray();
            char[] two = sc.next().toCharArray();
            boolean[] a = new boolean[10];
            boolean[] b = new boolean[10];
            for (char c : one) {
                a[c - '0'] = true;
            }
            for (char c : two) {
                b[c - '0'] = true;
            }
            boolean duri = true;

            for (int g = 0; duri && g < 10; g++) {
                duri = a[g] == b[g];
            }

            if (duri) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
