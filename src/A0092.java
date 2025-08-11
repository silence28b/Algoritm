import java.util.Scanner;

public class A0092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n / 6;
        System.out.println(m + " " + 4 * m + " " + m);
    }
}
