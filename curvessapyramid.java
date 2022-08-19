import java.util.*;
public class curvessapyramid {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height : ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double v = (2*3.14 * r * h);
        System.out.println("curved surface area of pyramid: " + v);
    }
}