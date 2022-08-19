import java.util.Scanner;
public class diffsumpro {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n =sc.nextInt();
        int s = 0, p =1;
        while(n!=0)
        {
            int r = n%10;
            s = s+r;
            p = p*r;
            n = n / 10;
        }
        int d = p - s;
        System.out.println("Difference is : "+ d);
    }
}
