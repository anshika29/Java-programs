import java.util.Scanner;
public class circle{
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius");
            double r  = sc.nextDouble();
            double a = 3.14 * r * r;
            System.out.println("Area of circle : " + a);
        }   
    }
    
}