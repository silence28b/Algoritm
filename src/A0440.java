import java.util.Scanner;

public class A0440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[][]{
                {0, 0},
                {25, 0},
                {50, 0},
                {75, 0},
                {100, 0},
        };

        boolean[] visibled = new boolean[5];

        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = 0; j < 5; j++) {
                int[] coordinate = arr[j];
                if (distance(coordinate[0], coordinate[1], x, y) <= 100) {
                    visibled[j] = true;
                }
            }
        }

        int count = 0;

        for (boolean b : visibled) {
            if (b) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
    }
}
