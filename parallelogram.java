import java.util.Scanner;
public class parallelogram{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double a  = b*h;
        System.out.println("Area of parallelogram:"+ a);
    }
}