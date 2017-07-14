# project-2
import java.io.*;
import java.util.*;
public class a1b10 {
	

	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	String str = s.next();
	String sd = new String();
	for(int i=0;i<str.length();i++)
	{
	if(Character.isDigit(str.charAt(i)))
	  {
	    for(int j=0;j<Integer.parseInt(String.valueOf(str.charAt(i)));j++)
	      {
	            System.out.println(sd);
	      }
	      sd="";
	  }
	  else
	    sd += String.valueOf(str.charAt(i));
	}
	}
	}
