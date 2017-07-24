# project-2
import java.io.*;
import java.util.*;
public class SortedOrder
{
public static void main(String args[])
{
int m;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
 m = sc.nextInt();
System.out.printn("Enter the elements of the array:");
int a[] = new int[m];
for(int i = 0;i < m;i++)
a[i] = sc.nextInt();
for(int i = 0;i < m;i++)
{
if(a[i]>a[i+1])
continue;
else
System.out.println("It is not in sorted order");
}
System.out.println("It is in Sorted Order");
}
}
