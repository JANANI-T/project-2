# project-2
import java.io.*;
import java.util.*;
public class Camel
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
 System.out.print("Enter a statement: ");
        String input = sc.nextLine();
        String result = "";
        char firstChar = input.charAt(0);
        result = result + Character.toUpperCase(firstChar);
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);
            if (previousChar == ' ') {
                result = result + Character.toUpperCase(currentChar);
            } else {
                result = result + Character.toLowerCase(currentChar);
            }
        }
        System.out.println(result);
    }
}
