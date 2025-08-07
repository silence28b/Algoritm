import java.util.Scanner;

public class A0678 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String harp = sc.next();
        int pos = 1;
        for (int i = 0; i < harp.length(); i++) {
            char horp = harp.charAt(i);

            if (pos == 1) {
                if (horp == 'A') pos = 2;
                else if (horp == 'C') {
                    pos = 3;
                }
            } else if (pos == 2) {
                if (horp == 'A') pos = 1;
                else if (horp == 'B') {
                    pos = 3;
                }
            } else {
                if (horp == 'B') pos = 2;
                else if (horp == 'C') {
                    pos = 1;
                }
            }


        }
        System.out.println(pos);

    }
}
