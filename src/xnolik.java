import java.util.Scanner;

public class xnolik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 3;

        char[][] game = new char[k][k];
        for (int i = 0; i < k; i++) {
            game[i] = sc.next().toCharArray();
        }

        boolean mainDiagonalX = true;
        boolean secondDiagonalX = true;
        boolean mainDiagonalO = true;
        boolean secondDiagonalO = true;
        for (int i = 0; i < k; i++) {
            mainDiagonalX = mainDiagonalX && game[i][i] == 'X';
            secondDiagonalX = secondDiagonalX && game[i][k - 1 - i] == 'X';
            mainDiagonalO = mainDiagonalO && game[i][i] == 'O';
            secondDiagonalO = secondDiagonalO && game[i][k - 1 - i] == 'O';

            boolean rowX = true;
            boolean rowO = true;
            boolean colX = true; // ustun
            boolean colO = true; // ustun
            for (int j = 0; j < k; j++) {
                rowX = rowX && game[i][j] == 'X';
                rowO = rowO && game[i][j] == 'O';
                colX = colX && game[j][i] == 'X';
                colO = colO && game[j][i] == 'O';
            }
            if (rowX || colX) {
                System.out.println("Win");
                return;
            }
            if (rowO || colO) {
                System.out.println("Lose");
                return;
            }
        }

        if (mainDiagonalX || secondDiagonalX) {
            System.out.println("Win");
        } else if (mainDiagonalO || secondDiagonalO) {
            System.out.println("Lose");
        } else {
            System.out.println("Draw");
        }


    }
}
/*
if (game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] == 'X' || game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == 'X' ||
                game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == 'X' || game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X' ||
                game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == 'X' || game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == 'X' ||
                game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X' || game[0][2] == 'X' && game[1][1] == 'X' && game[2][0] == 'X') {
            System.out.println("Win");
        } else if (game[0][0] == 'O' && game[0][1] == 'O' && game[0][2] == 'O' || game[1][0] == 'O' && game[1][1] == 'O' && game[1][2] == 'O' ||
                game[2][0] == 'O' && game[2][1] == 'O' && game[2][2] == 'O' || game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == 'O' ||
                game[0][1] == 'O' && game[1][1] == 'O' && game[2][1] == 'O' || game[0][2] == 'O' && game[1][2] == 'O' && game[2][2] == 'O' ||
                game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == 'O' || game[0][2] == 'O' && game[1][1] == 'O' && game[2][0] == 'O'){
            System.out.println("Lose");
        }else {
            System.out.println("Draw");
        }
 */