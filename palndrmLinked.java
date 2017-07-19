# project-2
import java.util.Scanner;

public class palndrmLinked {
  
  public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      StringBuffer s2=new StringBuffer(s1);
      String s3=String.valueOf(s2.reverse());
      if(s1.equalsIgnoreCase(s3))
      {
        System.out.println("It is a palindrome");
      }
      else
      System.out.println("It is not a palindrome");
      
  }
}
