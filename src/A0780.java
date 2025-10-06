import java.util.Scanner;

public class A0780 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int s = 0;
        while (sum < n){
            s++;
            sum += s;
        }
        System.out.println(s);

    }
}
