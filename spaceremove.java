import java.util.Scanner;
public class spaceremove {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            continue;
            else
            System.out.print(s.charAt(i));
        }
    }
}
