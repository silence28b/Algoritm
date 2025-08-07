import java.util.Scanner;

public class A0754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = Math.max(c,  Math.max(a,b));
        if (a >= 94 && a <= 727 && b >= 94 && b <= 727 && c >= 94 && c <= 727 ){
            System.out.println(m);
        } else {
            System.out.println("Error");
        }

    }
}
