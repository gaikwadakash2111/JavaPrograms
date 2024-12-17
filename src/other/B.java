package other;

import java.util.HashSet;

public class B {

	public static void main(String[] args) {
		
		HashSet<Integer> obj = new HashSet<Integer>();
		//declaration of set...
		
		obj.add(10);
		
		obj.add(20);
		
		obj.add(30);
		
		obj.add(40);
		
		obj.add(10);
		
		obj.add(20);
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		//obj.clear();
		
		System.out.println(obj);
		
		System.out.println(obj.contains(20));
		
		//for each loop
		for(int k:obj)
		{
			
			System.out.println(k);
		}
		
		HashSet<Character> obj1 =new HashSet<Character>();
		
		obj1.add('a');
		obj1.add('b');
		obj1.add('f');
		obj1.add('a');
		obj1.add('z');
		System.out.println(obj1);
		
		//for each loop
		for(char c:obj1)
		{
			System.out.println(c);
		}

	}

}
