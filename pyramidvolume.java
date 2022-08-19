import java.util.*;
public class pyramidvolume {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length,width and height  : ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double v = (l*w  * h) / 3;
        System.out.println("Volume of pyramid : " + v);
    }
}
