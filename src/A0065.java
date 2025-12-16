import java.util.Scanner;
public class A0065 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String x = sc.next();
        int n = sc.nextInt();
        int[] xato = new int[n];
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int soni = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)!=x.charAt(j)){
                    soni++;
                }
            }
            if (soni< min) min = soni;
            xato[i] = soni;
        }
        for (int i = 0; i < n; i++) {
            if (xato[i] == min) {
                cnt++;
            }
        }
        System.out.println(cnt);
        for (int i = 0; i < n; i++) {
            if (xato[i] == min) {
                System.out.print(i+1 + " ");
            }
        }
    }
}
