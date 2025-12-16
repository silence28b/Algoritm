import java.util.Scanner;
public class A0182 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1= sc.nextInt();
        int x2 = sc.nextInt(), y2= sc.nextInt();
        int x3 = sc.nextInt(), y3= sc.nextInt();
        double a = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        double b = Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
        double c = Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
        double g = Math.max(a,Math.max(b,c));
        if (g==a){
            System.out.println((x1+x2-x3)+" "+(y1+y2-y3));
        }else if (g==b){
            System.out.println((x2+x3-x1)+" "+(y2+y3-y1));
        }else {
            System.out.println((x1+x3-x2)+" "+(y1+y3-y2));
        }
    }
}
