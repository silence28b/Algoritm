import java.util.Scanner;

public class A0697remont2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int s = 2 * (a * h + b * h);
        int i = 0;
        while (s > 0) {
            s -= 16;
            i++;
        }
        System.out.println(i);
    }

}
