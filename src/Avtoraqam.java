import java.util.Scanner;

public class Avtoraqam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] raqamlar = new String[n];
        for (int i = 0; i < n; i++) {
            raqamlar[i] = sc.next();
        }
        char[] harp = {'A', 'B', 'C', 'E', 'H', 'K', 'M', 'O', 'P', 'T', 'X', 'Y'};
        for (String raqam : raqamlar) {

            if (raqam.length() == 6 && contains(harp, raqam.charAt(0)) && contains(harp, raqam.charAt(4)) && contains(harp, raqam.charAt(5))
                    && (raqam.charAt(1) >= '0' && raqam.charAt(1) <= '9')
                    && (raqam.charAt(2) >= '0' && raqam.charAt(2) <= '9')
                    && (raqam.charAt(3) >= '0' && raqam.charAt(3) <= '9')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }

    static boolean contains(char[] a, char key) {
        for (char c : a) if (c == key) return true;
        return false;
    }
}
