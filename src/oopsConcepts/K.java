package oopsConcepts;

public class K implements H{
	

	public void m1()
	{
		System.out.println("this implementation for m1()");
	}
	
	public void m2() 
	{
		System.out.println("this implementation for m2()");
	}
	
	public void m3()
	{
		System.out.println("this implementation for m3()");
	}

	public static void main(String[] args) {
		
		K obj = new K();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
