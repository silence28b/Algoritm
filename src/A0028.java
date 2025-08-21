import java.util.Scanner;

public class A0028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (x1 == x2) {
            System.out.println((x2-(a-x1)) + " " + b);
        } else if (y1 == y2) {
            System.out.println(a + " " + (y2-(b-y1)));

        }
    }
}
