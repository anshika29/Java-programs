import java.util.*;
public class sumtillzero {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int s=0,n=sc.nextInt();
        while(n!=0){
        System.out.println("enter the number: ");
        n = sc.nextInt();
        s=s+n;
        }
        System.out.println("Sum is:"+s);
    }
}
