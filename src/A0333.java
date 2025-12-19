import java.util.*;
public class A0333 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        Set<Character> A = new HashSet<>();
        Set<Character> B = new HashSet<>();
        Set<Character> C = new HashSet<>();
        for (char x : a.toCharArray()) A.add(x);
        for (char x : b.toCharArray()) B.add(x);
        for (char x : c.toCharArray()) C.add(x);
        A.retainAll(B);
        A.retainAll(C);
        List<Character> res = new ArrayList<>(A);
        Collections.sort(res);
        System.out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
            if (i<res.size()-1) System.out.print(" ");
        }
    }
}
