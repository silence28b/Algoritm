import java.util.Scanner;
public class A0064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] base = new int[n];
        for (int i = 0; i < n; i++) base[i] = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int num = 2;
        while (sb.length() < 10000) {
            if (tubMi(num)) sb.append(num);
            num++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sb.charAt(base[i] - 1));
        }
    }
    static boolean tubMi(int x) {
        if (x < 2 || x > 2 && x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
