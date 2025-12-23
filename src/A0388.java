import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class A0388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        int[] qm = new int[n];
        int[] um = new int[m];
        Arrays.fill(qm, Integer.MAX_VALUE);
        Arrays.fill(um, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j]=Integer.parseInt(st.nextToken());
                qm[i] = Math.min(qm[i],arr[i][j] );
                um[j] = Math.max(um[j],arr[i][j] );
            }
        }
        int cnt=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == qm[i] && arr[i][j]==um[j]) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
