import java.util.EventListener;
import java.util.Scanner;

public class A0694 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        int end = 31;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            start = Math.max(a, start); //eng kech boshlanish
            end = Math.min(b, end); // eng erta tugash
        }
        if (start <= end){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
