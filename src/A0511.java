import java.util.Scanner;

public class A0511 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 145) {
            System.out.println(((n*5)-5)/60 + " "+ ((n*5)-5)%60);
        }else {
            System.out.println("NO");
        }

    }
}
