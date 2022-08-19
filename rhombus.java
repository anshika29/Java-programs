import java.util.*;
public class rhombus {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the diagonals");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double a  = (d1*d2)/2;
        System.out.println("Area of rhombus:"+ a);
    }
    
}
