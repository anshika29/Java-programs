import java.util.Scanner;
public class vowelorconsonant {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        for(int i = 0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
                System.out.println(ch + " is vowel");
            else
                System.out.println(ch + " is consonant");
    
        }
        }
    }
