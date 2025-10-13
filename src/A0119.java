import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A0119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] time = new int[n][3];
        for (int i = 0; i < n; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
            time[i][2] = sc.nextInt();
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    if (o1[1] == o2[1]) {
                        return o1[2] - o2[2];
                    }
                    return o1[1] - o2[1];
                }
                return Integer.compare(o1[0], o2[0]);
            }
        });

        // System.out.println(Arrays.deepToString(time)); bu birdaniga chiqaradi

        for (int i = 0; i < n; i++) {
            System.out.println(time[i][0] + " " + time[i][1] + " " + time[i][2]);
        }

    }
}
