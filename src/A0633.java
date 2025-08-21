import java.util.Arrays;
import java.util.Scanner;

public class A0633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[4];
        String team = "";
        for (int i = 0; i < 4; i++) {
            names[i] = sc.nextLine();
            team = names[0];
        }
        Arrays.sort(names, 1, 4);
        System.out.println(team+": "+ names[1]+", "+ names[2]+", "+names[3]);


    }
}
