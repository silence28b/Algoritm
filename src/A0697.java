import java.util.Scanner;

public class A0697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = 2 * (a*c + b*c);
        System.out.println( (s+15) / 16 );




    }
}
