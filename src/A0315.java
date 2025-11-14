import java.util.Scanner;
public class A0315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxd = -1;
        for (char c : s.toCharArray()) {
            int value;
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else if (c>='A' && c <='Z'){
                value = c - 'A'+10;
            }else {
                System.out.println(-1);
                return;
            }
            maxd = Math.max(maxd, value);
        }
        int base = Math.max(2, maxd+1);
        System.out.println(base);

    }
}
