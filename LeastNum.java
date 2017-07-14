# project-2
import java.io.*;
import java.util.*;
public class LeastNum
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
String str=sc.next();
		int k=sc.nextInt();
		String s[]=str.split("");
		Arrays.sort(s);
		str=Arrays.toString(s);
		str=str.replaceAll("\\[","").replaceAll("\\]","").replaceAll("\\s","").replaceAll(",","");
		System.out.println(str.substring(0, s.length-k));		
	}
}
