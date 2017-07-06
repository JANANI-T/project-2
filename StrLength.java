# project-2
import java.util.Scanner;

class StrLength{
  
  public static void main(String...args){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter the String =>" +"  ");
    String ab = sc.nextLine();
    System.out.println("\nString Length is:" +len(ab));
  }
  
  public static int len(String ab){
    char[] ac = ab.toCharArray();
    int i = 0, k = 0;
    
    try{
      for(i=0,k=0;ac[i]!='\0';i++)
      k++;
    }
    catch(Exception e){
    }
    return k;
  }
  
}
