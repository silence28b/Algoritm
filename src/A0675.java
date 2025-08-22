import java.util.Scanner;

public class A0675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] s = new char[n][m];
        int min = 100;
        int nuqta = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().toCharArray();
            for (int j = 0; j < m; j++) {
                if (s[i][j] == '.') {
                    nuqta++;
                }
            }
            if (min > nuqta) {
                min = nuqta;
            }
            nuqta = 0;
        }
        System.out.println(min);
    }
}
