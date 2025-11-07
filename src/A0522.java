import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A0522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> SetA = new HashSet<>();
        for (int i = 0; i < n; i++) {
            SetA.add(sc.nextInt());
        }
        Set<Integer> SetB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            SetB.add(sc.nextInt());
        }
        System.out.println(SetA.equals(SetB) ? 1 : 0 );
    }
}
