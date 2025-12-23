import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A0349 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        List<Integer> tub = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (tubMa(i)) tub.add(i);
        }
        if (tub.isEmpty()) System.out.println("Absent");
        else for (int x : tub) System.out.println(x);
    }

    static boolean tubMa(int x) {
        if (x < 2 || x > 2 && x % 2 == 0) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
