import java.util.Scanner;

public class A0926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] kate = new char[n][n];
        int totalC = 0;
        int m = 1;
        int city = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                kate[i][j] = line.charAt(j);
                if (kate[i][j] == 'C') {
                    totalC++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m + "");
                if (kate[i][j] == 'C') {
                    city++;
                    if (city == totalC / 2) {
                        m = 2;
                    }
                }
            }
            System.out.println();
        }


    }
}
