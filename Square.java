# project-2
import java.util.Scanner;

public class Square {

  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m,j;
      for(m=0;m<n;m++)
      {
       if(m==0||m==n-1)
        for(int k=0;k<n;k++)
          System.out.print("* ");
       else
       {
        for(j=0;j<n;j++)
        {
          if(j==0||j==n-1)
           System.out.print("* ");
          else
           System.out.print("  ");
        }
        
       }
       System.out.println();
      }
     }
}
