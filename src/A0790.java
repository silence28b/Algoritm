import java.util.Scanner;

public class A0790 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("/");
        int d = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int y = Integer.parseInt(s[2]);
        int base = d + 1;
        String a = Integer.toString(d, base).toUpperCase();
        String b = Integer.toString(m, base).toUpperCase();
        String c = Integer.toString(y, base).toUpperCase();
        System.out.println(a + "/" + b + "/" + c);
    }
}
