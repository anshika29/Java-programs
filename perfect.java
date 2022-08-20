import java.util.Scanner;
public class perfect {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int t=n,s=0;
        for(int i =1 ;i<t;i++){
            if(n%i==0){
                s = s + i;
            }
        }
        if(s==n)
        System.out.println("Perfect Number");
        else
        System.out.println("Not a perfect number ");
    }
}
