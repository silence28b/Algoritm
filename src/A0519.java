import java.util.Arrays;
import java.util.Scanner;

public class A0519 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] m = n.toCharArray();
        Arrays.sort(m);
        String a = new String(m);
        String ters = new StringBuilder(a).reverse().toString();
        go:
        while (m[0] - '0' == 0) {
            for (int i = 0; i < m.length; i++) {
                char b = m[0];
                m[0] = m[i];
                m[i] = b;
                if (m[0] - '0' != 0) {
                    break go;
                }

            }
        }
        String min = new String(m);
        System.out.print(min + " " + ters);
    }
}
