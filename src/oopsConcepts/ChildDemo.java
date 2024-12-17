package oopsConcepts;

public class ChildDemo extends ParentDemo{
	
	// over-riding method
	public void marriage()
	{
		System.out.println("Deepika padukone");
	}

	public static void main(String[] args) {
		
		ChildDemo obj =new ChildDemo();
		
		obj.property();
		
		obj.marriage();

	}

}
