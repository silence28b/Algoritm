import java.util.Scanner;

public class Chaladasturchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] duri = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            char[] row = line.toCharArray();
            duri[i] = row;
        }
        char [][] xato = new char[n][m];
        for (int j = 0; j < n; j++) {
            String line2 = sc.next();
            char[] row2 = line2.toCharArray();
            xato[j] = row2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (duri[i][j] == xato[i][j]){
                    sum++;

                }

            }

        }
        System.out.println(sum);




    }
}
