import java.util.Arrays;
import java.util.Scanner;
public class A0516 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (i == '0') {
                System.out.println("No");
                break;
            }
        }
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder().append(s);
        String up = sb.toString();
        String down = sb.reverse().toString();
        if (tubMa(up) && tubMa(down)) System.out.println("Yes");
        else System.out.println("No");
    }
    static boolean tubMa(String a) {
        int x = Integer.parseInt(a);
        if (x < 2 || x > 2 && x % 2 == 0) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
