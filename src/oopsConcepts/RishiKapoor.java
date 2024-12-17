package oopsConcepts;

public class RishiKapoor extends RajKapoor{
	
	public void acting()
	{
		System.out.println("good acting skills");
	}
	
	public void dancing()
	{
		System.out.println("not so good dancing skills");
	}
	
	public static void main(String[] args) {
		RishiKapoor obj=new RishiKapoor();
		obj.singing();
		obj.acting();
		obj.dancing();
		
	}
	
}
