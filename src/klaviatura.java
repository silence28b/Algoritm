import java.util.Scanner;

public class klaviatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = "qwertyuiopasdfghjklzxcvbnmq";
        char harp = sc.next().charAt(0);
        for (int i = 0; i < arr.length() - 1 ; i++) {
            if (arr.charAt(i)==harp){
                System.out.println(arr.charAt(i+1));
                break;
            }

        }
    }
}
