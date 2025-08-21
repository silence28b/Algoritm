import java.util.Arrays;
import java.util.Scanner;

public class A0340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] box1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] box2 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        Arrays.sort(box1);
        Arrays.sort(box2);

        if (box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]) {
            System.out.println("Boxes are equal");
        } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
            System.out.println("The first box is smaller than the second one");
        } else if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
            System.out.println("The first box is larger than the second one");
        } else {
            System.out.println("Boxes are incomparable");
        }
    }
}
