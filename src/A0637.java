import java.util.Scanner;

public class A0637 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] <= k){
                max += arr[i];
            } else if (arr[i] > k){
                max += k;
            }

        }
        System.out.println(max );

    }
}
