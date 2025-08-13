import java.util.Scanner;

public class poyezdtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vaqt = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = Integer.parseInt(vaqt.substring(0, 2));
        int m = Integer.parseInt(vaqt.substring(3, 5));
        int sum = h * 60 + m + a * 60 + b;
        sum %= 1440;
        int q1 = sum / 60;
        int q2 = sum % 60;
        String q3 = "" + q1;
        String q4 = "" + q2;
        if (q1 < 10) {
            q3 = "0" + q1;
        }
        if (q2 < 10) {
            q4 = "0" + q2;
        }
        System.out.println(q3 + ":" + q4);


    }
}
