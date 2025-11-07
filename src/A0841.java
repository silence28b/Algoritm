import java.util.*;
public class A0841 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n==0 ? 1 : n*n-n+2);
    }
}
