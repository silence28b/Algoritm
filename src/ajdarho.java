import java.util.Scanner;

public class ajdarho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (n >= m) {
            System.out.println(1);
            return;
        } else if (k >= n) {
            System.out.println("NO");
            return;
        }
        int s = 0;
        int j = m;
        int x;
        while (j > 0) {
            s++;
            x = j - n;
            if (x <= 0) {
                break;
            }
            j = x + k;

        }
        System.out.println(s);
    }
}
