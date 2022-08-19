import java.util.*;
public class cylindervolume {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height : ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double v = (3.14 * r * r * h);
        System.out.println("Volume of cylinder : " + v);
    }
}