import java.util.Scanner;

public class A0046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = "2.7182818284590452353602875";
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(3);
            return;
        } else if (n == 25) {
            System.out.println(m);
            return;
        }
        char[] arr = m.substring(0, n + 3).toCharArray();
        int num = arr[n + 1] - '0';
        if (arr[n + 2] >= '5') {
            num += 1;
        }
        System.out.println(m.substring(0, n + 1) + num);

    }
}
