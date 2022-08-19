import java.util.*;
public class conevolume {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height : ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double v = (3.14 * r * r * h) / 3;
        System.out.println("Volume of cone : " + v);
    }
}
