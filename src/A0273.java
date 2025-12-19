import java.util.Scanner;
public class A0273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        if (n<3){
            System.out.println(0);
            return;
        }
        boolean[][][] bl = new boolean[10][10][10];
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            int a = s.charAt(i)-'0';
            if (a==0) continue;
            for (int j = i+1; j < n; j++) {
                int b = s.charAt(j)-'0';
                for (int k = j+1; k <n ; k++) {
                    int c = s.charAt(k)-'0';
                    if (!bl[a][b][c]){
                        bl[a][b][c]=true;
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
