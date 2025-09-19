import java.util.Scanner;

public class A0044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < n.length() - 4; i++) {
            if (n.charAt(i) == '>' && n.charAt(i + 1) == '>' && n.charAt(i + 2) == '-' && n.charAt(i + 3) == '-' && n.charAt(i + 4) == '>'
            || n.charAt(i) == '<' && n.charAt(i + 1) == '-' && n.charAt(i + 2) == '-' && n.charAt(i + 3) == '<' && n.charAt(i + 4) == '<') {
                sum++;
            }
        }
        System.out.println(sum);

    }
}
