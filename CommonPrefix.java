# project-2
import java.io.*;
import java.util.*;
 public class CommonPrefix
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int len=s1.length();
    if(len>s2.length())
    {
      len=s2.length();
    }
    
    StringBuilder a = new StringBuilder();
    for(int i=0;i<len;i++)
    {
      if(s1.charAt(i)==s2.charAt(i))
      {
        a.append(s1.charAt(i));
      }
      else
      {
        break;
      }
    }       
    System.out.println(a.toString());
}
}
