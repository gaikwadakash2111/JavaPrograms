package other;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(10);
		
		a.add(20);
		
		a.add(30);
		
		a.add(40);
		
		a.add(10);
		
		//a.clear();
		
		System.out.println(a.contains(10));
		
		System.out.println(a);
		//.....[10, 20, 30, 40]
		
		/*
		System.out.println(a.get(1));
		
		System.out.println(a.get(3));
		
		//System.out.println(a.get(7));
		
		System.out.println(a);
		
		System.out.println(a.size());
		
		a.add(99);
		
		System.out.println(a);
		
		a.remove(4);
		
		System.out.println(a);
		
		a.add(0, 77);
		//insertion

		System.out.println(a);
		
		a.set(0, 88);
		
		System.out.println(a);
		//1st way(direct)
		
		//2nd way(for loop)
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println('\n');
		
		//3rd way(for each loop)
		for(int k:a)
		{
			System.out.println(k);
		}
		
	}
	*/
		ArrayList<String> obj2=new ArrayList<String>();
		
		obj2.add("aaliya");
		obj2.add("salman");
		obj2.add("srk");
		obj2.add("varun");
		obj2.add("aaliya");
		System.out.println(obj2);
		System.out.println(obj2.get(0));
		
		//for loop
		for(int i=0; i<obj2.size(); i++)
		{
			System.out.println(obj2.get(i));
		}
		
		System.out.println('\n');
		
		//for each loop
		for(String s:obj2)
		{
			System.out.println(s);
		}
		
		
	}

}
