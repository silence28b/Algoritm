import java.util.Scanner;

public class Omadlichipta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (isLucky(t + 1) || isLucky(t - 1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

    private static boolean isLucky(int t) {
        return sumDigit(t % 1000) == sumDigit(t / 1000);
    }

    private static int sumDigit(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}

