import java.util.Scanner;
public class A0073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            int val;
            if (c >= '0' && c <= '9') {
                val = c - '0';
            }else {
                val = c-'A'+10;
            }
            int pos = i + 1;
            int son = (val - pos) % 27;
            if (son <= 0) son += 27;
            char f = (char)('a' + son - 1);
            if (f == '{') sb.append(" ");
            else sb.append(f);
        }
        System.out.println(sb);
    }
}
