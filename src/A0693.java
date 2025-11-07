import java.util.Arrays;
import java.util.Scanner;

public class A0693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        if (a.length() != b.length()) {
            System.out.println("No");
            return;
        }
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
