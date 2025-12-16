import java.util.*;
public class A0321 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> base = new ArrayList<>();
        for (int i = 2; i <=36 ; i++) {
            Set<Character> rep = new HashSet<>();
            String any = Integer.toString(n,i);
            int l = any.length();
            for (char x : any.toCharArray()) rep.add(x);
            if (l== rep.size()) base.add(i);
        }
        int s = base.size();
        for (int i = 0; i < s-1; i++) {
            System.out.print(base.get(i)+" ");
        }
        System.out.print(base.get(s-1));
    }
}
