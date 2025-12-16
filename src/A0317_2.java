import java.util.Scanner;

public class A0317_2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), w = sc.nextInt();
        int[] sovgala = {x, y, z};
        long [] dp = new long[w+1];
        dp[0]=1;
        for (int sovga : sovgala){
            for (int s = sovga; s<=w; s++){
                dp[s]+=dp[s-sovga];
            }
        }
        System.out.println(dp[w]);
    }
}
