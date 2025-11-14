import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A0785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        List<String> avtomorf = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            long x = (long) i * i;
            String n = Integer.toString(i);
            String m = Long.toString(x);
            int l = n.length();
            int y = Integer.parseInt(m.substring(m.length() - l));
            if (y == i) {
                avtomorf.add(n + " ");
            }
        }
        for (String k : avtomorf) {
            System.out.print(k + " ");
        }
    }
}
