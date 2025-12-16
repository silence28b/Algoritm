import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A0265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> cells = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            cells.add(r + "," + c);
        }
        int P = 0;
        int[] dr = {0, 0, -1, 1};
        int[] dc = {-1, 1, 0, 0};
        for (String cell : cells) {
            String[] parts = cell.split(",");
            int r = Integer.parseInt(parts[0]);
            int c = Integer.parseInt(parts[1]);
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (!cells.contains(nr + ","+nc)) P++;
            }
        }
        System.out.println(P);
    }
}
