import java.util.Arrays;
import java.util.Scanner;
public class A0491 {
    static boolean palMa(String s) {
        String ts = new StringBuilder(s).reverse().toString();
        return s.equals(ts);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] x = s.toCharArray();
        Arrays.sort(x);
        if (s.length()==1 || x[0] == x[s.length()-1]){
            System.out.println("NO SOLUTION");
            return;
        }
        if (!palMa(s)) {
            System.out.println(s);
        }else System.out.println(s.substring(0, s.length() - 1));

    }
}