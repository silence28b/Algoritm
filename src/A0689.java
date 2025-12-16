import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A0689 {
    static String asos (int num, int base){
        return Integer.toString(num, base).toUpperCase();
    }
    static int qiyinlik (String s){
        int l = s.length();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        return l+set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int minas = 2;
            String minson = asos(num, 2);
            int osonlik = qiyinlik(minson);
            for (int base = 3; base <=36; base++){
                String son = asos(num, base);
                int qiyin = qiyinlik(son);
                if (qiyin<osonlik){
                    osonlik = qiyin;
                    minas = base;
                    minson = son;
                }
            }
            System.out.println(minas+" "+minson);
        }
    }
}
