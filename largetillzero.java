import java.util.Scanner;
public class largetillzero {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int max =0 ;
        while(n!=0){
        
        System.out.println("Enter the number");
        n = sc.nextInt();
        if(n>max){
        max=n;}
        
    }
    System.out.println("Largest number is : "+ max);
    }
}
