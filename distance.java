import java.util.*;
public class distance {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the coordinates : ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        double d =Math.sqrt(((x2-x1)*(x2-x1))- ((y2-y1)*(y2-y1)));
        System.out.println("Distance" + d);

    }
}
