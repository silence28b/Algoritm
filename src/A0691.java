import java.util.Scanner;

public class A0691 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] raqamlar = new String[n];
        for (int i = 0; i < n; i++) {
            raqamlar[i] = sc.next();
        }
        char[] harp = {'A', 'B', 'C', 'E', 'H', 'K', 'M', 'O', 'P', 'T', 'X', 'Y'};
        for (String raqam : raqamlar) {
            /*for (int i = 0; i < raqamlar.length; i++) {
                String raqam = raqamlar[i];
                (raqam : raqamlar) - bu raqamlarni aylanib raqamga i indeksdagini vaqtincha yukla degani
            }*/
            if (raqam.length() == 6 && contains(harp, raqam.charAt(0)) && contains(harp, raqam.charAt(4)) && contains(harp, raqam.charAt(5))
                    && raqam.charAt(1) >= '0' && raqam.charAt(1) <= '9'
                    && raqam.charAt(2) >= '0' && raqam.charAt(2) <= '9'
                    && raqam.charAt(3) >= '0' && raqam.charAt(3) <= '9') {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    static boolean contains(char[] a, char key) {
        for (char c : a) if (c == key) return true;
        // bu joyda biror 'c' belgi kelsa 'a' matrix ni ichidan c ni tekshiradi, agar shu belgi a da mavjud bolsa keyin indeksini tekshiradi agar indeksi ham togri kelsa true qaytaradi //
        return false;

    }
}

