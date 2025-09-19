import java.util.Scanner;

public class A0068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int x = sc.nextInt();
        if (n.equals("Home")){
            System.out.println("Yes");
        }else {
            if (x%2!=0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
