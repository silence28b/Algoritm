import java.util.Scanner;

public class A0504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a = 'G', b = 'C', c = 'V';
        if (n % 3 == 0){
            System.out.println(" "+a + b + c);
        } else if (n % 3 == 1) {
            System.out.println(" "+ c + a + b);
        } else {
            System.out.println(" " + b + c + a);
        }
    }

}
