import java.util.Scanner;
public class equitriangle {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side");
        double s = sc.nextDouble();
        double a  = (Math.sqrt(3)/4)*s*s;
        System.out.println("Area of equilateral triangle:"+ a);
    }
}
