import java.util.Scanner;

public class A0043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int max = 0;
        int nol = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i)=='0'){
                nol ++;
                if (nol > max) {
                    max = nol;
                }
            } else {
                nol=0;
            }

        }
        System.out.println(max);
    }
}
