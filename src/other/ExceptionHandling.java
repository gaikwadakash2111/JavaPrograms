package other;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		try
		{
		System.out.println(10/0);
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("handling code...!!");
		}
		
	}

}
