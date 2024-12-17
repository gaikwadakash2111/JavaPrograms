package typesOfVariables;

public class InstanceDemo {
	
	int i=10;  // instance variable.....
	
	public void login()
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		InstanceDemo m=new InstanceDemo();
		
		System.out.println(m.i);
		
		m.login();
		
	}

}
