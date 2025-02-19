import java.util.Scanner;

public class ReversingString {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuffer buf=new StringBuffer();
        String rev=buf.append(str).reverse().toString();
        System.out.println("Reverse of a String For :"+str +" is  :"+rev);
    }
}
