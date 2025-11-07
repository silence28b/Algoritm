import java.util.Scanner;

public class A0665 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3, 5));

        while (true) {
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }

            String hh = String.format("%02d", h);
            String mm = String.format("%02d", m);

            boolean duri = h % 10 == m / 10 && h / 10 == m % 10;
            if ( duri){
                System.out.println(hh + ":" + mm);
                break;
            }
        }
    }
}
