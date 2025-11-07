import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A0283 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        char[] s = sc.readLine().toCharArray();
        int count = 0;
        for (char c : s) {
            if (Character.isUpperCase(c)) {
                if (count != 0 && (count < 2 || count > 4)) {
                    System.out.println("No");
                    return;
                }
                count = 0;
            }
            count++;
        }
        if (!Character.isUpperCase(s[0]) || count < 2 || count > 4) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}