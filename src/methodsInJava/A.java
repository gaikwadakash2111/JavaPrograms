package methodsInJava;

public class A {
	
	String s1 = "srk";         // instance....
	
	static String s3= "allu arjun";   // static
	
	public void m1()
	{
	String s = "aaliya bhat";  // local
	System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		A obj=new A();
		obj.m1();
		System.out.println(obj.s1);
		System.out.println(s3);

	}

}
