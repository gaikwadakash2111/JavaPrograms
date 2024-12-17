package methodsInJava;

public class Pmethod {
	
	public void add(int i)
	{
		System.out.println("this is para..method!!");
	}
	
	public void add(String z) {
		System.out.println("this is para..method with string arg!!");
	}
	
	public void add()
	{
		System.out.println("this is normal method!!");
	}

	public static void main(String[] args) {
		 
		Pmethod obj = new Pmethod();
		
		obj.add(44);
		
		obj.add();
		
		obj.add("akshay");

	}

}
