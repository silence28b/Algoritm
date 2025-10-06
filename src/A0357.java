import java.util.Scanner;

public class A0357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int toq = 0;
        int juft = 0;
        if (n.length() < 2) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < n.length(); i++) {
            if (i % 2 == 0) {
                toq += n.charAt(i) - '0';
            } else {
                juft += n.charAt(i) - '0';
            }
        }
        if (toq - juft == 0 || (juft - toq) % 11 == 0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
