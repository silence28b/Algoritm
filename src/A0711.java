import java.util.Scanner;

public class A0711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] ism = new String[n];
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            ism[i] = sc.next();
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += sc.nextInt();
            }
            time[i] = sum;
        }
        int indeks = 0;
        for (int i = 1; i < n; i++) {
            if (time[i] < time[indeks]){
                indeks = i;
            }
        }
        System.out.println(ism[indeks]);

    }
}
