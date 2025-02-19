import java.util.Scanner;

public class CheckforPalindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer buffer=new StringBuffer();
        String rev=buffer.append(s).reverse().toString();
        if(s.equals(rev))
        {
            System.out.println("Given String : "+s+" is a Palindromic String");
        }else{
            System.out.println("Given String : "+s+" is Not a Palindromic String");

        }
    }
}