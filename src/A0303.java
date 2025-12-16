import java.util.Scanner;
public class A0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < l; i++) {
            int sum = 0;
            int ind = 0;
            for (int j = 0; j < l; j++) {
                if (j == i) continue;
                int x = s.charAt(j) - '0';
                if (ind % 2 == 0) sum += x;
                else sum -= x;
                ind++;
            }
         if (sum>max) max = sum;
        }
        System.out.println(max);
    }
}
