package oopsConcepts;

public class Child extends ADemo{
	
	public void m1()
	{
		System.out.println("implementation for abstract method m1()");
	}
	
	public void m3()
	{
		System.out.println("implementation for abstract method m3()");
	}

	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.m2();
		obj.m1();
		obj.m3();
		
	}
}
