# project-2
import java.util.Scanner;

public class Average {
  
  public static void main(String[] args) {
      Scanner mj = new Scanner(System.in);
      int n = mj.nextInt();
      int[] a = new int[n];
      int length = n/2;
      int b = 0; 
      int c = 0;
    		  
    		  
      int sum = 0;
      for(int i = 0; i < n; i++) {
        a[i] = mj.nextInt();
        if(i >= length) {
            b+= a[i];
        }
        else {
            c+= a[i];
        }
        sum+= a[i];
      }
      int avg = sum/n;
      int avg1 = c/length;
      int avg2 = b/(n-length);
      int j = a.length - avg;
      if(avg1 == avg2) {
        for(int i=0;i<=j;i++)
         {
           System.out.print(a[i]+" ");
         }
         System.out.print(", ");
         for(int i=a.length-1;i>=avg;i--)
         {
           System.out.print(a[i]+" ");
         }
      }
      else {
        System.out.println("Not Possible");
      }
      mj.close();
  }
  
}
