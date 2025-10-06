import java.util.Arrays;
import java.util.Scanner;

public class A0457 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int s = 0;
        while (!n.equals("6174")) {
            char[] nums = n.toCharArray();
            Arrays.sort(nums);
            String a = new String(nums);
            String ters = new StringBuilder(a).reverse().toString();

            int x = Integer.parseInt(ters);
            int y = Integer.parseInt(a);
            int j = x - y;
            n = String.format("%04d", j);
            s++;
        }
        System.out.println(n + " " + s);

    }
}
