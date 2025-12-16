import java.util.Scanner;
public class A0069 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt();
        double alfa = Math.PI / n;
        double sin = Math.sin(alfa);
        double cos = Math.cos(alfa);
        double d = (a / 2.0) * ((1.0 - cos) / sin);
        System.out.println(d < 1.0 ? "YES" : "NO");
    }
}
