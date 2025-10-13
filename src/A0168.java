import java.util.Scanner;

public class A0168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String s = "";
        int i = 1;
        while (!s.contains(n)) {
            s += i;
            i++;
        }
        int pos = s.indexOf(n) + 1;
        System.out.println(pos);

    }
}
