# project-2
import java.io.*;
import java.util.*;
public class Small{
  
public static void main(String[] args) 
{
    int[] elements  = {0 , 2 , 10 , 3, -93,7,100,5 }; 
  
  int secondSmallest = 0; 
  
  
    for (int j = 0; j < elements.length; j++)
    {
      
        if (elements[j] < secondSmallest)
        {
          secondSmallest = elements[j];
        
      
    
  
  
  System.out.println("The second smallest element is: " + secondSmallest);
      } }    }}  
