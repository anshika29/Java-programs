import java.util.*;
public class electricbill {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the electric usage:");
        double e = sc.nextDouble();
        double b=0; 
        if(e<=100)
        b = e* 1.2;
        else if(e>100)
        b = 100* 1.2 + (e-100)*2;
        else if(e>200)
        b = 100*1.2 + 100* 2 + (e-200)*3.2;
        System.out.println("Bill is : "+ b);
    }
    
}

