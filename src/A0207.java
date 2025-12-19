import java.util.Locale;
import java.util.Scanner;
public class A0207 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = 0, y=0, d= Math.sqrt(2)/2;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a==1){
                y+=b;
            } else if (a==2) {
                x+=b*d;
                y+=b*d;
            } else if (a==3) {
                x+=b;
            } else if (a==4) {
                x+=b*d;
                y-=b*d;
            } else if (a==5) {
                y-=b;
            } else if (a==6) {
                x-=b*d;
                y-=b*d;
            } else if (a==7) {
                x-=b;
            }else if (a==8){
                x-=b*d;
                y+=b*d;
            }
        }
        System.out.printf("%.3f %.3f\n", x, y);

    }
}
