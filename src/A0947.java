import java.util.Locale;
import java.util.Scanner;

public class A0947 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = 2;
        double y = 0;
        int sum = 0;
        while (x>=y){
             y += (double) 1 /n;
             sum ++;
             n++;
        }
        System.out.print(sum + " "+ "card" + "(s)");
    }
}
