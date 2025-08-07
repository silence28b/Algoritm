import java.util.Scanner;

public class A0850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.min(a,b);
        int min = (Math.max(a,b) +1) / 2 ;
        System.out.println(min + " " + max);




    }
}

