import java.util.Scanner;

public class funksiya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char a = n.charAt(0);
      //  char letter = n.charAt(0);
       String m = n.substring(1,2);
        int y = Integer.parseInt(m);
        int x = number(a);
        //int x = letterToNumber(letter);
        boolean black = isBlack(x, y);
        if (black){
            System.out.println("BLACK");
        }else{
            System.out.println("WHITE");
        }


    }
    public static int number (char a){
        return a - 'A'+1;
    }

  /*  public static int letterToNumber(char letter) {
        return switch (letter) {
            case 'A' -> 1;
            case 'B' -> 2;
            case 'C' -> 3;
            case 'D' -> 4;
            case 'E' -> 5;
            case 'F' -> 6;
            case 'G' -> 7;
            case 'H' -> 8;
            default -> 0;
        };
    } */

    public static boolean isBlack(int x, int y) {
        return (x % 2 == 0 && y % 2 == 0 || x % 2 != 0 && y % 2 != 0);

    }

}
