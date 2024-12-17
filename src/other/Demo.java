package other;

import java.util.Arrays;

public class Demo {

	
	public static void main(String[] args) throws InterruptedException {
	    
	    int number = 10;
	 
		int a[] = {10, 20, 30, 40};
		// array
		
		System.out.println(a[0]);
		
		System.out.println(a[3]);
		
		System.out.println(a[1]);
		
		try
		{
		System.out.println(a[9]);
		}
		catch (Exception e)
		{
			System.out.println("plz check index value...");
		}
		
		//System.out.println(a);
		
		System.out.println(Arrays.toString(a));
		// first approach
		
		System.out.println(a.length);
		
		System.out.println();
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		// 2nd approach
		
		System.out.println('\n');
		
		for(int p:a)
		{
			System.out.print(p);
		}
		// 3rd approach....
		
		System.out.println();
		
		String names[] = {"akshay", "ajay", "srk", "varun"};
		
		for(String k:names)
		{
			System.out.println(k);
		}
	}

}
