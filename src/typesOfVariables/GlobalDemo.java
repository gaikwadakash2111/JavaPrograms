package typesOfVariables;

public class GlobalDemo {
	
	static int i = 10; // global variable.....
	
	public static void main(String[] args) {
		
		System.out.println(i);
		// directly....
		
		GlobalDemo g=new GlobalDemo();
		
		System.out.println(g.i);
		
		System.out.println(GlobalDemo.i);
	}

}
