# project-2
import java.io.*;
import java.util.*;
public class NumericString
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Input value:");
    String s=sc.nextLine();
    char[]c=s.toCharArray();
    boolean flag=false;
    for(int i=0;i<c.length;i++)
    {
      if(c[i]=='0'||c[i]=='1'||c[i]=='2'||c[i]=='3'||c[i]=='4'||c[i]=='5'||c[i]=='6'||c[i]=='7'||
      c[i]=='8'||c[i]=='9'||c[i]=='.'||c[i]=='e')
      {
        flag=true;
        }}
        {
          if (flag == true)
          {
            System.out.println("The given input is true");
          }
          else
          {
            System.out.println("The given input is false");
          }   }}}
