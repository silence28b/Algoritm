import java.util.Scanner;
public class A0317 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), w = sc.nextInt(), k = 0;
        for (int i =0; i <= w / x; i++) {
            for (int j =0; j <= w / y; j++) {
                int s = w - i * x - j * y;
                if (s >= 0 && s % z == 0) k++;
            }
        }
        System.out.println(k);

    }
}
