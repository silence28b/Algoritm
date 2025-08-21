import java.util.Scanner;

public class A0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= Math.abs(n) ; i++) {
            sum = sum +i;
        }
        if (n <= 0) {
            sum *= -1;
            sum ++;
        }
        System.out.println(sum);
    }
}

