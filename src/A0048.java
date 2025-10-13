import java.util.Scanner;

public class A0048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String j = "1";
        for (int i = n.length() - 1; i >=0 ; i--) {
            if (n.charAt(i) == '0'){
                j  += "0";
            }else break;
        }
        System.out.println(j);
    }
}
