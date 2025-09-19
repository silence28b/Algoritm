import java.util.Scanner;

public class A0271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a =1 ,b = 1;
        long index = 2;
        if (n==1){
            System.out.println(1);
            System.out.println(1);
            return;
        }
        while (b<n){
            long c = a +b;
            a=b;
            b=c;
            index ++;
        }
        if (b==n){
            System.out.println(1);
            System.out.println(index);
        }else {
            System.out.println(0);
        }
    }
}
