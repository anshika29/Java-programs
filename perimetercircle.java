import java.util.Scanner;
public class perimetercircle {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius");
            double r  = sc.nextDouble();
            double p = 2*3.14 * r;
            System.out.println("Perimeter of circle : " + p);
        }   
    }
}
