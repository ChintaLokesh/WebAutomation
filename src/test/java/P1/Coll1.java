package P1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Coll1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> arrayList= new LinkedList<String>();
		System.out.println(arrayList.size());
		arrayList.add("200");
		arrayList.add("10");
		arrayList.add("110");
		arrayList.add("120");
		arrayList.add("130");
		arrayList.add("140");
		arrayList.add("130");
		arrayList.add("130");
		arrayList.add(0,"567");
		arrayList.remove(0);
		
		System.out.println(arrayList.size());
		
		for(String a:arrayList)
		{
			System.out.println(a);
		}
			
		System.out.println("--------------");
		
		//ArrayList<String> a2= new ArrayList<String>();
		LinkedList<String> a2= new LinkedList<String>();
		a2.addAll(arrayList);
		a2.add("987891");
		//a2.removeFirst();
		//a2.removeLast();
		for(String a:a2)
		{
			System.out.println(a);
		}
		
		//a2.remove(0);
		a2.removeAll(arrayList);
		System.out.println("--------------");
		for(String a:a2)
		{
			System.out.println(a);
		}
	}

}
