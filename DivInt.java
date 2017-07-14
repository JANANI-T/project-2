# project-2
import java.io.*;
import java.util.*;
public class DivInt
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
int div = s.nextInt();
int divi = s.nextInt();
int count = 0;
while(div>0)
{
div = div - divi;
count++;
}
{
System.out.println(count-1);
}
}
}
