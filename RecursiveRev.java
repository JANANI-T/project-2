# project-2
import java.io.*;
import java.util.*;
public class RecursiveRev
{
public static void main(String args[])
{
	
				
				ArrayList<Integer> a1 = new ArrayList<Integer>();
				
				a1.add(1);
				a1.add(2);
				a1.add(3);
				a1.add(4);
				a1.add(5);
				
				System.out.println("The list elements are :");
				ListIterator<Integer> it = a1.listIterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				System.out.println("The reverse order: ");
				while(it.hasPrevious())
				{
					System.out.println(it.previous());
				}
				
				}

		
	

}

