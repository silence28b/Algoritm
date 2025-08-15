import java.util.Scanner;

public class stakantagidashar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String harf = sc.next();
        int pos = 1;
        for (int i = 0; i < harf.length(); i++) {
            char harp = harf.charAt(i);

            if (pos==1){
                if (harp =='A') pos =2 ;
                else if (harp == 'C') {
                    pos = 3;
                }
            } else if (pos == 2) {
                if (harp == 'A') pos = 1;
                else if (harp == 'B') {
                    pos = 3;
                }
            } else {
                if (harp =='B') pos = 2;
                else if (harp == 'C') {
                    pos = 1;
                }
            }
        }
        System.out.println(pos);

    }
}
