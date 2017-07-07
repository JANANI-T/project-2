# project-2
import java.io.*;
import java.util.*;
public class Palindrome
{
  public static void main(String arg[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    int n,m,rev=0,i;
    n=Integer.parseInt(br.readLine());
    m=n;
    
    while(n!=0)
    {
      i=n%10;
      rev=(rev*10)+i;                 
      n/=10;
    }
    
    if(m==rev)
    System.out.println("\nThe given Number is palindrome");
    else
    System.out.println("\nThe given Number is not palindrome");
  }
}
