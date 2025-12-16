import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A0287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        Set<String> sbs = new HashSet<>();
        for (int i = 0; i <=n-m ; i++) {
            String sub = s.substring(i, i+m);
            sbs.add(sub);
        }
        System.out.println(sbs.size());
    }
}
