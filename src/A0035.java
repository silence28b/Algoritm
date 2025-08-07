import java.util.Scanner;

public class A0035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
             int a1 = sc.nextInt();
             int b1 = sc.nextInt();
            System.out.println(19*b1 + ((a1+239)*(a1+366))/2);
        }






    }
}
