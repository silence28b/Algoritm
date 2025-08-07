import java.util.Scanner;

public class A0106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        [1,0,1,1,0]

        int birlar = 0;
        int nollar = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                nollar++;
            } else if(arr[i] == 1){
                birlar++;
            }
        }

        System.out.println(Math.min(nollar, birlar));

    }
}
