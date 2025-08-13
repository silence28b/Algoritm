import java.util.Scanner;

public class A0839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean nol = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0') {
                System.out.println("NO");
                nol = true;
                break;
            }

        }
        if (!nol) {
            System.out.println("YES");
        }

    }
}
