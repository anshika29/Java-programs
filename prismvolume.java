import  java.util.*;
public class prismvolume {
    public static void main(String[]args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the base and height");
       double base = sc.nextDouble();
       double height = sc.nextDouble();
       double v = base * height;
       System.out.println("Volume of prism"+ v); 
    }
}
