import java.util.Scanner;

public class sortlash {
    public static void main(String[] args) {
        int[] sonla = {4, 3, 1, 2, 9, 5, 7, 6, 8};
        for (int i = 0; i < sonla.length; i++) {
            for (int j = 0; j < sonla.length - i - 1; j++) {
                if (sonla[j] > sonla[j + 1]) {
                    int m = sonla[j];
                    sonla[j] = sonla[j + 1];
                    sonla[j + 1] = m;
                }
            }
        }
        for (int i = 0; i < sonla.length; i++) {
            System.out.print(sonla[i]+ " ");
        }
    }
}
