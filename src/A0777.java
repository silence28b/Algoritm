import java.util.Scanner;

public class A0777 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > a) {
            System.out.println(b - a);
        } else {
            System.out.println(12 - a + b);
        }

    }
}
