import java.util.Scanner;
public class A0600 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] son = new String[n];
        for (int i = 0; i < n; i++) {
            son[i] = sc.next();
            System.out.println(tengma(son[i]) ? "YES" : "NO");
        }
    }
    static boolean tengma(String x) {
        int s1 = 0, s2 = 0, s3 = 0, w=0, l=x.length();
        while (w < l && x.charAt(w) == '0') {
            s1++; w++;
        }
        while (w < l && x.charAt(w) == '1'){
            s2++; w++;
        }
        while (w < l && x.charAt(w) == '2'){
            s3 ++; w++;
        }
        if (w!=l) return false;
        return (s1==s2 && s2==s3);
    }
}
