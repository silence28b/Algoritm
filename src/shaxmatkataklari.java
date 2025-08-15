import java.util.Scanner;

public class shaxmatkataklari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char x = n.charAt(0);
        int xq = x - 'A' + 1;
        String m = n.substring(1, 2);
        int yq = Integer.parseInt(m);
        if (xq == yq || xq % 2 == 0 && yq % 2 == 0 || xq % 2 != 0 && yq % 2 != 0){
            System.out.println("BLACK");
        }else {
            System.out.println("WHITE");
        }

    }
}
