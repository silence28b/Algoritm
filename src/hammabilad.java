import java.util.Scanner;

public class hammabilad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.contains("0")){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
