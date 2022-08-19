import java.util.Scanner;
public class averageofn {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int limit = sc.nextInt();
        int c=1;
        double s = 0;
        while(c<=limit){
            System.out.println("Enter the number");
            double n = sc.nextInt();
            s = s+n;
            c++;
        }
        double avg = s/limit;
            System.out.println("Average is"+avg);    
    }
}
