/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			count++;
		}
		System.out.println(count);
		
	}
}
