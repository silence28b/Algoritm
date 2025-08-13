import java.util.Scanner;

public class orfografiya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(str.substring(0,n-1) + str.substring(n));

    }
}
