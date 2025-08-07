import java.util.Scanner;

public class A0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String toq = "";
        String juft = "";

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                juft += a + " ";

            } else {
                toq += a + " ";
            }

        }
        System.out.println(toq);
        System.out.println(juft);
        System.out.println(juft.length() >= toq.length() ? "YES" : "NO");


    }
}