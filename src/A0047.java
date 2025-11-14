import java.util.Scanner;

public class A0047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int best = 1;
        int bestSum = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int sum = digitSum(i);
                if (sum > bestSum || sum == bestSum && i < best) {
                    best = i;
                    bestSum = sum;
                }
            }
        }
        System.out.println(best);
    }
    static int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
