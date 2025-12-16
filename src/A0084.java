import java.util.Scanner;
public class A0084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] rang = new char[n][m];
        int minRow = n, maxRow = 0, minCol = m, maxCol = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < m; j++) {
                rang[i][j] = s.charAt(j);
                if (rang[i][j] == '*') {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }
        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                rang[i][j] = '*';
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(new String(rang[i]));
        }
    }
}
