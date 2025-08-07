import java.util.Scanner;

public class A0233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       boolean qrash = false;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a <= 437) {
                System.out.println("Crash " + (i + 1));
                qrash = true;
                break;
            }
        }
        if ( !qrash ) {
            System.out.println("No crash");

        }



    }
}
