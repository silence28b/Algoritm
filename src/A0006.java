import java.util.Scanner;

public class A0006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            int x1 = input.charAt(0) - 'A' + 1;
            int y1 = input.charAt(1) - '0';
            int x2 = input.charAt(3) - 'A' + 1;
            int y2 = input.charAt(4) - '0';

            if (!(x1 > 0 && x1 <= 8 && y1 > 0 && y1 <= 8 && x2 > 0 && x2 <= 8 && y2 > 0 && y2 <= 8 && input.charAt(2) == '-')) {
                throw new Exception();
            }

            if (Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2 || Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
