import java.util.Scanner;

public class A0935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if ((x1 + y1) % 2 == 0 && (x2 + y2) % 2 == 0) {
            System.out.println("YES");
        } else if ((x1+y1)%2!=0 && (x2+y2)%2!=0) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }
}
