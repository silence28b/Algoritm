import java.util.Scanner;

public class A0164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticket = sc.nextLine();
        int l = ticket.length();
        boolean lucky = false;
        for (int i = 1; i < l; i++) {
            String left = ticket.substring(0, i);
            String right = ticket.substring(i);
            if (ildiz(left) == ildiz(right)) {
                lucky = true;
                break;
            }
        }
        System.out.println(lucky ? "YES" : "NO");
    }
    static int ildiz(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        if (sum == 0) return 0;
        return (sum % 9 == 0) ? 9 : sum % 9;
    }
}
