import java.util.Scanner;

public class A0253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt(), m1 = sc.nextInt();
        int h2 = sc.nextInt(), m2 = sc.nextInt();
        int s = h1 * 60 + m1;
        int e = h2 * 60 + m2;
        if(e <= s){
            e += 24 * 60;
        }
        int count = 0;
        for (int i = s + 1; i < e; i++) {
            int mm = i % 60;
            int hh = (i / 60) % 24;

            if (mm == 0) {
                int urishlar_Soni = hh % 12;
                if (urishlar_Soni == 0) urishlar_Soni = 12;
                count += urishlar_Soni;
            } else if (mm == 30) {
                        count += 1;
            }
        }
        System.out.println(count);
    }
}
