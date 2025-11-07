import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A0579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        List<Integer> pint = new ArrayList<>();
        List<Integer> nint = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0) {
                sum1 += x;
                pint.add(i + 1);
            } else if (x < 0) {
                sum2 += x;
                nint.add(i + 1);
            }
        }
        if (sum1 >= Math.abs(sum2)) {
            System.out.println(pint.size());
            for (int a : pint) {
                System.out.print(a + " ");
            }
        } else {
            System.out.println(nint.size());
            for (int b : nint) {
                System.out.print(b + " ");
            }
        }
    }
}
