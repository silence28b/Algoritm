import java.util.Scanner;

public class L_3477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fruit = {4, 2, 5};
        int[] basket = {3, 5, 4};
        numOfUnplacedFruits(fruit, basket);
    }

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int yes = 0;


        for(int i=0; i < fruits.length; i++){
            for(int j=0; j < baskets.length; j++){
                if(fruits[i]<=baskets[j]){
                    yes += 1;
                    baskets[j]=0;
                    break;
                }

            }
        }
        return n - yes;

    }
}
