package oopsConcepts;

public class Demo {
	
	public void add()
	{
		System.out.println("a general method...!!");
	}
	
	public void add(int x) // method with arg...or param. method
	{
		System.out.println("method with int arg...");
	}
	
	public void add(int y, int z)
	{
		System.out.println("method with int, int arg...");
	}

	public static void main(String[] args) {
		
		Demo obj = new Demo();
		
		obj.add();
		obj.add(0);
		obj.add(22);
		//obj.add(0.22f);
		obj.add(0, 0);
		obj.add(12, 87);

	}

}
