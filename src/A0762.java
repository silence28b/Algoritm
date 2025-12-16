import java.util.Scanner;
public class A0762 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a=1, k=0;
        while (n>a){
            a*=3;
            k++;
        }
        System.out.println(k);
    }
}
