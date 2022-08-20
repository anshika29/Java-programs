import java.util.Scanner;
public class sumofn {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int limit  = sc.nextInt();
        int c = 1,s=0;
        while(c<=limit)
        {
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            s = s + n;
            c++;
        }
        System.out.println("Sum of n numbers"+ s);
    }
}
