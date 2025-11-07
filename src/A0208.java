import java.util.Arrays;
import java.util.Scanner;

public class A0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String binary = Integer.toBinaryString(N);
        int max = 0;
        for (int i = 0; i < binary.length(); i++) {
            binary = binary.substring(binary.length() - 1) + binary.substring(0, binary.length() - 1);

            int value = Integer.parseInt(binary, 2);
            max = Math.max(max, value);
        }
        System.out.println(max);

    }
}
