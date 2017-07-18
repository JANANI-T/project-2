# project-2
import java.io.*;
import java.util.*;
public class PangramOrNot
{
public static void main(String ar4gs[])
{
try {
 final String str;
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     str = br.readLine().toLowerCase().replaceAll(" ","");
     char[]  chars = str.toCharArray();
     final Set set = new HashSet();
     for(char c: chars)
     {
       set.add(c);
                    }
                    if(set.size() == 26)
                    System.out.println("It is Pangram");
                    else
                    System.out.println("It is not a Pangram");
                    }
                    catch (Exception e)
                    {
                      e.printStackTrace();
                      }  }
                      }
