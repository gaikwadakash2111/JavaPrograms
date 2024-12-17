package methodsInJava;

public class Demo1 {
	
	int i = 10;
	
	public void add(int x)
	{
		System.out.println(100+10);
	}

	public void mul()
	{
		System.out.println(100*10);
	}
	
	public void sub()
	{
		System.out.println(100-10);
	}
	
	public static void main(String[] args) {
		
		Demo1 obj=new Demo1();
		
		obj.add(190);
		
		obj.mul();
		obj.add(200);
		obj.mul();
		obj.sub();
		System.out.println(obj.i);
	}

}
