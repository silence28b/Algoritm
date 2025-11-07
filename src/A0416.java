import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class A0416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        int x = p.charAt(0) - 'a' + 1;
        int y = p.charAt(1) - '0';
        int[][] moves = {
                {2,1}, {2,-1},{-2,1},{-2,-1},
                {1,2},{1,-2},{-1,2},{-1,-2}
        };
        List<String> result = new ArrayList<>();
        for (int[] move : moves ){
            int nx = x+move[0];
            int ny = y+move[1];
            if (nx>=1 && nx<=8 && ny>=1 && ny<=8){
                char harp = (char) ('a'+nx-1);
                char s = (char)('0'+ny);
                result.add(""+harp+s);
            }
        }
        for (String k : result){
            System.out.println(k);
        }
    }
}
