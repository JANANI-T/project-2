# project-2
import java.io.*;
import java.util.*;
public class PrimeNum
{
private static boolean isPrime;

public static void main(String args[])
{
int limit = 100;
System.out.println("Enter the number between 1 and "+limit);
for(int j=1;j<100;j++)
{
boolean isPrime = true;
for(int i=2; i<j; i++)
{
if (j % i == 0)
{
 isPrime = false;
}
}

if (isPrime)
System.out.print(j +" ");
}}
}
