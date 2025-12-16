import java.util.Scanner;
public class A0847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        if (a.length() != b.length() || a.equals(b) ) {
            System.out.println("NO");
            return;
        }
        int n = a.length();
        int[] harp = new int[26];
        for (int i = 0; i < n; i++) {
            harp[a.charAt(i) - 'a']++;
            harp[b.charAt(i) - 'a']--;
        }
        for (int i : harp) {
            if (i!=0){
                System.out.println("NO");
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
