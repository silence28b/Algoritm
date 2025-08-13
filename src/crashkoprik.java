import java.util.Scanner;

public class crashkoprik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean crash = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 437) {
                System.out.println("Crash" + " " + (i + 1));
                crash = true;
                break;
            }

        }
        if (!crash){
            System.out.println("No crash");
        }

    }
}
