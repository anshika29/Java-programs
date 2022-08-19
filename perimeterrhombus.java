import java.util.*;
public class perimeterrhombus {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the side");
            double a = sc.nextDouble();
            double  p = 4 *a;
            System.out.println("Perimeter of rhombus : " + p);
        }   
    }
}

