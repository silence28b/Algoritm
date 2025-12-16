import java.util.*;
public class A0961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        char[][] p = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().trim();
            for (int j = 0; j < m; j++) {
                p[i][j] = s.charAt(j);
            }
        }
        sc.nextLine();
        char[][] b = new char[n][m];
        for (int i = 0; i < n; i++) {
            String ss = sc.nextLine().trim();
            for (int j = 0; j < m; j++) {
                b[i][j] = ss.charAt(j);
            }
        }
        int[] x1 = new int[128];
        int[] y1 = new int[128];
        int[] x2 = new int[128];
        int[] y2 = new int[128];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = p[i][j];
                if (c != '.') {
                    x1[c] = i;
                    y1[c] = j;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = b[i][j];
                if (c != '.') {
                    x2[c] = i;
                    y2[c] = j;
                }
            }
        }
        int k = 0;
        StringBuilder l = new StringBuilder();
        StringBuilder u = new StringBuilder();
        for (char c = 0; c < 128; c++) {
            if (x1[c] != 0 || y1[c] != 0 || x2[c] != 0 || y2[c] != 0) {
                if (x1[c] != x2[c] || y1[c] != y2[c]) {
                    k++;
                    if (Character.isLowerCase(c)) l.append(c);
                    else if (Character.isUpperCase(c)) u.append(c);
                }
            }
        }
        System.out.println(k);
        System.out.println(l+""+u);
    }
}
