import java.util.Scanner;

public class A0900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n / 24;
        System.out.println((13 * x) + " " + (4 * x) + " " + (7 * x));

    }
}
