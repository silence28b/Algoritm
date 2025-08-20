import java.util.Scanner;

public class A0798time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        int qora = 0;
        int oq = 0;
        if ((x + y) % 2 == 0 && r == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i + j) % 2 == 0) {
                        qora++;
                    } else {
                        oq++;
                    }
                }
            }

        } else if ((x + y) % 2 == 0 && r == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i + j) % 2 == 0) {
                        oq++;
                    } else {
                        qora++;
                    }
                }
            }
        }  else if ((x + y) % 2 != 0 && r == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i + j) % 2 == 0) {
                        oq++;
                    } else {
                        qora++;
                    }
                }
            }
        } else if ((x + y) % 2 != 0 && r == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i + j) % 2 == 0) {
                        qora++;
                    } else {
                        oq++;
                    }
                }
            }
        }


        if (qora > oq) {
            System.out.println("black");
        } else if (qora < oq) {
            System.out.println("white");
        } else {
            System.out.println("equal");
        }
    }
}
