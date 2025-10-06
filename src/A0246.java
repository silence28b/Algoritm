import java.util.Scanner;

public class A0246 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] slr = new int[n];
        for (int i = 0; i < slr.length; i++) {
            slr[i]=sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < slr.length - 1; i++) {
            if (slr[i+1]-slr[i]!=1){
                sum++;
            }
        }
        System.out.println(sum);

    }
}
