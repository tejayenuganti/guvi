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
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] a=new int[n];
		int m=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=i)
			{
				a[i]=0;
			}
			
		
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
		if(a[i]!=0)
		{m++;
		if(m==1)
		System.out.print(a[i]);
		else if(m>1)
		System.out.print(" "+a[i]);
		else
		System.out.print("-1");
		}}
	}
}
