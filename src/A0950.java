import java.util.Scanner;

public class A0950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String harp = "";
        int nol = 0;

        for (int i = 0; i < str.length(); i++) {
            char raqam = str.charAt(i);

            if (raqam == '0') {
                nol++;
            } else if (raqam == '1') {
                harp = harp + (char) ('a' + nol);
                nol = 0;
            }
        }
        System.out.println(harp);
    }
}
