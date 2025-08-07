import java.util.*;

public class A0791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = i * 8 + j + 1;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[i][j] == n) {
                    if (i - 1 >= 0) {
                        System.out.println(arr[i - 1][j]);
                    }
                    if (j - 1 >= 0) {
                        System.out.println(arr[i][j - 1]);
                    }
                    if (j + 1 < 8) {
                        System.out.println(arr[i][j + 1]);
                    }
                    if (i + 1 < 8) {
                        System.out.println(arr[i + 1][j]);
                    }
                }

            }
        }

    }
}

