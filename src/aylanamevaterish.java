import java.util.Scanner;

public class aylanamevaterish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int sum ;
        for (int i = 0; i < n; i++) {
            sum = (arr[i] + arr[(i+1)%n] + arr[(i+2)%n]);
            if (sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
