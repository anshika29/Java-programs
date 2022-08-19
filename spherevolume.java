import java.util.*;
public class spherevolume {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height : ");
        double r = sc.nextDouble();
        double v = (3.14 * r * r * r*4) / 3;
        System.out.println("Volume of sphere : " + v);
    }
}