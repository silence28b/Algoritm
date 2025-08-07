import java.util.Scanner;

public class A0818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n - 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
           sum = sum + sc.nextInt();
        }
        System.out.println(sum - m);
    }
}
