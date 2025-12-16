import java.util.Scanner;
public class A0764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] kor = new int[n][2];
        for (int i = 0; i < n; i++) {
            kor[i][0] = sc.nextInt();
            kor[i][1] = sc.nextInt();
        }
        int max = 1;
        for (int i = 0; i < n - 1; i++) {
            int k1 = 1, k2 = 1, k3 = 1, k4 = 1;
            for (int j = i + 1; j < n; j++) {
                if (kor[i][0] >= 0 && kor[i][1] >= 0 && kor[j][0] >= 0 && kor[j][1] >= 0) {
                    if (kor[i][0] * kor[j][1] == kor[i][1] * kor[j][0]) k1++;
                    max = Math.max(max, k1);
                } else if (kor[i][0] <= 0 && kor[i][1] >= 0 && kor[j][0] <= 0 && kor[j][1] >= 0) {
                    if (kor[i][0] * kor[j][1] == kor[i][1] * kor[j][0]) k2++;
                    max = Math.max(max,k2);
                } else if (kor[i][0] <= 0 && kor[i][1] <= 0 && kor[j][0] <= 0 && kor[j][1] <= 0) {
                    if (kor[i][0] * kor[j][1] == kor[i][1] * kor[j][0]) k3++;
                    max = Math.max(max,k3);
                } else if (kor[i][0] >= 0 && kor[i][1] <= 0 && kor[j][0] >= 0 && kor[j][1] <= 0) {
                    if (kor[i][0] * kor[j][1] == kor[i][1] * kor[j][0]) k4++;
                    max = Math.max(max,k4);
                }
            }
        }
        System.out.println(max);

    }
}
