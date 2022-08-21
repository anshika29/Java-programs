import java.util.Scanner;
public class uppercase{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s  = sc.nextLine();
        for(int i = 0 ; i<s.length(); i++)
        {
            int ch = s.charAt(i);
            if(ch>=97 && ch<=122)
            {
                ch = ch -32;
            }
            System.out.print((char)ch);
        }
    }
}
