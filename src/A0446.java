import java.util.Scanner;

public class A0446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] arr = new char[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                char numChar = arr[i][j];

                boolean correct = numChar == '.' ||
                        numChar == 'R' && (num == 4 || num == 5 || num == 6 || num == 7) ||
                        numChar == 'G' && (num == 2 || num == 3 || num == 6 || num == 7) ||
                        numChar == 'B' && (num == 1 || num == 3 || num == 5 || num == 7);
                if (!correct){
                    System.out.println("NO");
                    return;
                }

            }

        }
        System.out.println("YES");


    }
}
