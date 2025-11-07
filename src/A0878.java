import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A0878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[] array = sc.next().getBytes();

        byte[][] arr = new byte[26][2];
        for (byte i = 0; i < 26; i++) {
            arr[i][0] = (byte) (array[i] - 'A');
            arr[i][1] = i;
        }

        Arrays.sort(arr, new Comparator<byte[]>() {
            @Override
            public int compare(byte[] o1, byte[] o2) {
                return Byte.compare(o1[0], o2[0]);
            }
        });

        for (int i = 0; i < array.length; i++) {
            if (arr[i][0] < i) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        for (byte[] b : arr) {
            System.out.print(b[1] + 1 + " ");
        }
    }
}
