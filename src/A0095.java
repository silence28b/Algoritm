import java.util.Scanner;

public class A0095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if (n.length() == 1) {
            System.out.println(n + " " + 0);
            return;
        }
        int si = 0;
        while (n.length() > 1) {
            int sum = 0;
            for (char i : n.toCharArray()) {
                sum += (i - '0');
            }
            n = String.valueOf(sum);
            si++;
        }
        System.out.println(n + " " + si);

    }
}
