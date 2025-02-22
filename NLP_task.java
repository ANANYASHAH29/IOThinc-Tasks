//Q1) NLP task using JAVA
import java.util.*;
class Text{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextLine();
            int c=arr[i].length();
            if(c<1 || c>100)
            {  System.out.println("Input text in line "+(i+1)+" is out of the range [1,100]");
                break;
            }
        }
        String s=String.join(" ",arr);
        char ch;
        int countS=0,countT=0;
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='T')
            countT++;
            else if(ch=='S')
            countS++;
            else 
            continue;
        }
        if(countT>countS)
        System.out.println("English");
        else
        System.out.println("French");
    }
}
