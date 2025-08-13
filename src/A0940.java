import java.util.Scanner;

public class A0940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (i != n - 1) {
                System.out.print(str.charAt(i) + "");
            }

        }
    }
}
