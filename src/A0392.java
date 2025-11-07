import java.util.Scanner;

public class A0392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[2*n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
            b[i + n] = a[i];
        }

        int start = 0;
        for (int i = 1; i < n; i++) {
            boolean better = false;
            for (int j = 0; j < n; j++) {
                if (b[i + j] < b[start + j]) {
                    better = true;
                    break;
                } else if (b[i + j] > b[start + j]) {
                    break;
                }
            }
             if (better) {
                  start = i;
            }
        }

           for (int i = 0; i < n; i++) {
              System.out.print(b[start + i] + " ");
           }


    }
}
