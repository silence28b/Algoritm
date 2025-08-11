import java.util.Scanner;

public class binar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        while (n > p){
            p *= 2;
        }
        if (p==n){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
