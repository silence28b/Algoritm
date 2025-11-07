import java.util.Scanner;

public class A0309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        for (int x = 0; x < k; x++) {
            if (x+reverse(x)==k){
             sum++;
            }
        }
        System.out.println(sum);
    }

    static int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }
}
