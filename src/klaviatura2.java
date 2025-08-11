import java.util.Scanner;

public class klaviatura2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = "qwertyuiopasdfghjklzxcvbnmq";
        char harp = sc.next().charAt(0);
        int index = arr.indexOf(harp);
        System.out.println(arr.charAt(index+1));

    }
}
