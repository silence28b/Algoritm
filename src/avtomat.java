import java.util.Scanner;

public class avtomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(19 * m + ((n + 239) * (n + 366))/2);


        }

    }
}
