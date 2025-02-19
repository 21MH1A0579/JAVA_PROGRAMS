import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        int vcount=0,ccount=0;
       for(char ch:s.toCharArray())
       {
          if(ch=='a'||ch=='e'|| ch=='i' || ch=='o' ||ch=='u')
          {
            vcount++;
          }else if(Character.isLetter(ch)){
            ccount++;
          }
       }
       System.out.println("Vowels count is "+vcount+" and Consonants Count is "+ccount);
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
        //     {

        //     }
        // }
        
    }
}
