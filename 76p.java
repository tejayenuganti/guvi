/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i;
		int sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for( i=1;i<=n/2;i++)
		{
			if(n%i==0)
			sum++;
			
		}
		if(sum!=1)
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
