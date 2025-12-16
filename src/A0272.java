import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class A0272 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] ps = line.split(" ");
        int mint = 10000;
        int maxj = -10000;
        for (int i = 0; i < ps.length; i++) {
            int x = Integer.parseInt(ps[i]);
            if ((i+1)%2==1){
                mint = Math.min(mint, x);
            }else {
                maxj = Math.max(maxj,x);
            }
        }
        System.out.println(mint+maxj);
    }
}
