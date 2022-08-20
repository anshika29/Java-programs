import java.util.Scanner;
public class armstrong {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int t=n,s=0;
        while(t>0)
        {
            int r = t%10;
            s = s+ r*r*r;
            t = t/10;
        }
        if(s==n)
        System.out.println("Armstrong number : "+n);
        else
        System.out.println("Not an armstrong number : "+ n);

    }
}
