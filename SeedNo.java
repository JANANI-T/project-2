# project-2
import java.io.*;
import java.util.*;
public class SeedNo
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number:");
int m = s.nextInt();
System.out.println("Enter the number for Checking:");
int j = s.nextInt();
int temp;
temp=m;
    if(temp%10==temp)
    temp=temp*temp;
    else
    while(m>0)
    {
    temp=(m%10)*temp;
    m=m/10;
    if(temp == j)
    {
    System.out.println("It is a seed of 'm'");
    }
    else
    {
    System.out.println("It is not a seed of 'm'");
    }
    s.close();
    }
    }
}
