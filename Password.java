# project-2
import java.io.*;
import java.util.*;
public class Password
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String m = sc.nextLine();
String n = sc.nextLine();
int count1 = 1,count2 = 1,size = (m.length() > n.length())?m.length():n.length();
for(int j = 0;j<size;j++)
try
{
System.out.println(m.charAt(j));
}
catch(Exception e)
{
System.out.println(count1);
}
count1++;
try
{
System.out.println(n.charAt(j));
}
catch(Exception e)
{
System.out.println(count2);
}
count2++;
}
}
