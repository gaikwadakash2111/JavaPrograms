package typesOfVariables;

public class LocalDemo {
	
	public void login()
	{
		int j = 20; // local variables.....
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		
		int i = 10; // local
		
		System.out.println(i);
		
		LocalDemo obj=new LocalDemo();
		obj.login();
       
	}

}
