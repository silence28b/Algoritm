import java.util.Scanner;

public class A0014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ek = 0;
        int qol = 0;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        while (min != 0) {
            qol = max % min;
            max = min;
            min = qol;
        }
        ek = (a*b)/max;
        System.out.println(ek);


    }
}
