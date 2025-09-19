import java.util.Scanner;

public class A0163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int result = 0;
        if (n.charAt(0) == 'x') {
            int b = n.charAt(2) - '0';
            int c = n.charAt(4) - '0';
            if (n.charAt(1) == '+') {
                result = c - b;
            } else {
                result = c + b;
            }
        } else if (n.charAt(2) == 'x') {
            int a = n.charAt(0) - '0';
            int c = n.charAt(4) - '0';
            if (n.charAt(1) == '+') {
                result = c - a;
            } else {
                result = a - c;
            }
        } else if (n.charAt(4) == 'x') {
            int a = n.charAt(0) - '0';
            int b = n.charAt(2) - '0';
            if (n.charAt(1) == '+') {
                result = a + b;
            } else {
                result = a - b;
            }
        }
        System.out.println(result);

    }
}
