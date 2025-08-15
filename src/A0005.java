import java.util.Scanner;

public class A0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String juft = "";
        String toq = "";

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m % 2 == 0) {
                juft += m + " ";
            } else {
                toq += m + " ";
            }
        }
        System.out.println(toq);
        System.out.println(juft);
        System.out.println(juft.length()>=toq.length() ? "YES" : "NO");

    }
}
