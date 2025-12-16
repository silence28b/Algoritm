import java.util.Scanner;

public class A0530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.nextLine();
        String[] img1 = new String[h];
        for (int i = 0; i < h; i++) img1[i] = sc.nextLine().trim();
        String[] img2 = new String[h];
        for (int i = 0; i < h; i++) img2[i] = sc.nextLine().trim();
        String x = sc.nextLine().trim();
        int[] op = new int[4];
        for (int i = 0; i < 4; i++) {
            int y = x.charAt(i)-'0';
            op[i] = y;
        }
        for (int i = 0; i < h; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < w; j++) {
                int a = img1[i].charAt(j) - '0';
                int b = img2[i].charAt(j) - '0';
                int res = op[a * 2 + b];
                sb.append(res);
            }
            System.out.println(sb);
        }
    }
}
