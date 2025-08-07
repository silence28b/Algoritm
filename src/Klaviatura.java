import java.util.Scanner;

public class Klaviatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = "qwertyuiopasdfghjklzxcvbnmq";
        System.out.println(arr.charAt(arr.indexOf(sc.next().charAt(0)) + 1));
    }
}
