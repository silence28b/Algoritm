import java.util.Scanner;

public class A0336 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        int cur = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.length(); i++) {
            if (nums.charAt(i) == '1') {
                cur++;
            } else {
                cur--;
            }

            if (cur > max) {
                max = cur;
            }
            if (cur < min) {
                min = cur;
            }
        }
        System.out.println(max - min + 1);


    }
}
