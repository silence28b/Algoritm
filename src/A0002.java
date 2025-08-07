import java.util.Scanner;

public class A0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = (Math.abs(n) * (Math.abs(n) + 1)) / 2;


        if (n <= 0) {
            sum *= -1;
            sum++;
        }
        System.out.println(sum);
    }
}
