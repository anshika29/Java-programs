import java.util.Scanner;
public class addition {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int s  = n1 + n2;
        System.out.println("Sum of two numbers is "+ s);
    }

}
