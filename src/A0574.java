import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A0574 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        if (s1.length() != s2.length()) {
            System.out.println("NO");
            return;
        }
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'A']++;
            count[s2.charAt(i) - 'A']--;
        }
        for (int c : count) {
            if (c != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
