import java.util.Scanner;

public class A0062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int xq = n.charAt(0) - 'A' + 1;
        int yq = Integer.parseInt(n.substring(1, 2));
        if ((xq + yq) % 2 == 0) {
            System.out.println("BLACK");
        } else {
            System.out.println("WHITE");
        }

    }

}
