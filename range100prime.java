import java.util.*;
public class range100prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        for(int n=1;n<=100;n++){
            int f=0;
            for(int i = 2;i<=(int)Math.sqrt(n);i++){
                if(n%i == 0){
                    f=1;
                    break;
                }
            }
        if(f==0)
        System.out.print(n+ " ");

        }
    }
    
}
