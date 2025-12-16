import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A0836 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x%2==0) {
                String oct = Integer.toOctalString(x);
                int y = oct.charAt(oct.length()-3)-'0';
                if (y%2==1) list.add(x);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        if (!list.isEmpty()){
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i<list.size()-1) System.out.print(" ");
            }
        }
    }
}
