import java.util.Scanner;

public class A0053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = 0;
        int g = 0;
        int blu = 0;
        int bla = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int x = i * j;
                if (x % 5 == 0) {
                    blu++;
                } else if (x % 3 == 0) {
                    g++;
                } else if (x % 2 == 0) {
                    r++;
                } else {
                    bla++;
                }
            }
        }
        System.out.println("RED" + " " + ":" + " " + r);
        System.out.println("GREEN" + " " + ":" + " " + g);
        System.out.println("BLUE" + " " + ":" + " " + blu);
        System.out.println("BLACK" + " " + ":" + " " + bla);


    }
}
