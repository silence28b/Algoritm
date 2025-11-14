import java.util.Scanner;

public class A0093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] duri = new String[n];
        for (int i = 0; i < n; i++) {
            duri[i] = sc.next();
        }
        int m = sc.nextInt();
        String[] xato = new String[m];
        for (int i = 0; i < m; i++) {
            xato[i] = sc.next();
        }
        for (int i = 0; i <n ; i++) {
            int ind = 0;
            for (int j = 0; j <m ; j++) {
                if (duri[i].length()!=xato[j].length()) continue;
                int diff = 0;
                for (int k = 0; k < duri[i].length(); k++) {
                    if (duri[i].charAt(k)!=xato[j].charAt(k)){
                        diff++;
                        if (diff>1) break;
                    }
                }
                if (diff==1) ind++;
            }
            System.out.println(ind + " ");
        }
    }
}
