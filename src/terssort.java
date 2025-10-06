import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class terssort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int s = 0;

        char[] on = n.toCharArray();
        char[] ters = n.toCharArray();
        for (int i = 0; i < n.length(); i++) {
            for (int j = i + 1; j < n.length(); j++) {
                if (on[i] < on[j]) {
                    char a = on[i];
                    on[i] = on[j];
                    on[j] = a;
                }
            }
        }
        String x = new String(on);
        for (int i = 0; i < n.length(); i++) {
            for (int j = i + 1; j < n.length(); j++) {
                if (ters[i] > ters[j]) {
                    char b = ters[i];
                    ters[i] = ters[j];
                    ters[j] = b;

                }

            }

        }
        String y = new String(ters);
        int reult = Integer.parseInt(y) - Integer.parseInt(x);
        if (reult < 10) reult *= 1000;
        else if (reult < 100) reult *= 100;
        else if (reult < 1000) reult *= 10;
        n = String.valueOf(reult);

    }

}


