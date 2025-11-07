import java.util.Arrays;
import java.util.Scanner;

public class A0119_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] time = new int[n][3];
        int[] sek = new int[n]; // sekund massiv
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            time[i][0] = x;
            time[i][1] = y;
            time[i][2] = z;
            // sekundga aylantiramiz
            sek[i] = (x * 3600) + (y * 60) + z;

        }
        Arrays.sort(sek);
        for (int i = 0; i < n; i++) {
            System.out.println(sek[i] / 3600 + " " + (sek[i] / 60) % 60 + " " + sek[i] % 60);

        }
    }
}
