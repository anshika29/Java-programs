import java.util.*;
public class prime {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();
        int f = 0;
        for(int i =2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("Prime number");
        else
        System.out.println("Not a prime number");
    }
    
}
