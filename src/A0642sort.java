import java.util.Scanner;

public class A0642sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] avto = new int[n];
        for (int i = 0; i < n; i++) {
            avto[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (avto[j] > avto[j + 1]) {
                    int m = avto[j];
                    avto[j] = avto[j + 1];
                    avto[j + 1] = m;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (s - avto[i] >= 0) {
                s -= avto[i];
                sum++;
            }
        }
        System.out.print(sum);
    }
}




