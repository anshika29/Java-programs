import java.util.Scanner;
public class lcm {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = 0,lcm=0;
        for(int i =1;i<=n1&&i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                hcf = i;
            }
        }
        lcm = (n1*n2)/hcf;
        System.out.println("LCM of two numbers is :  " + lcm);
    }
}
