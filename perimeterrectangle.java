import java.util.*;
public class perimeterrectangle {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the breadth and height");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double  p = 2*(a+b);
            System.out.println("Perimeter of rectangle : " + p);
        }   
    }
}
