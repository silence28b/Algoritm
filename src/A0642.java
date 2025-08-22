import java.util.Arrays;
import java.util.Scanner;

public class A0642 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] avto = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            avto[i]=sc.nextInt();
        }
        Arrays.sort(avto);
        for (int i = 0; i < n; i++) {
            if (s>0 && s-avto[i] >=0){
                s -= avto[i];
                sum++;
            }
        }
        System.out.println(sum);

    }
}
