import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        int k = sc.nextInt();
        // sonlar osish tartibida beriladi. k son qaysi indeksdaligi soraladi
        int max = n - 1;
        int min = 0;
        int middle;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        while (true) {
            middle = (max + min)/2;
            if (k<nums[middle]){
                max = middle;
            } else if (k>nums[middle]) {
                min = middle;
            }else {
                System.out.println(middle);
                break;
            }
        }
    }
}
