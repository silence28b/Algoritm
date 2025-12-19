import java.util.Scanner;

public class A0278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int s = 0;
        int m = 0;
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            while (m < b.length()) {
                char y = b.charAt(m);
                m++;
                if (y == x) {
                    s++;
                    break;
                }
            }
        }
        if (s == a.length()) System.out.print("YES");
        else System.out.print("NO");
    }
}
