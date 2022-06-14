package P1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Col2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet<String> a= new HashSet<String>();
	//	LinkedHashSet<String> a = new LinkedHashSet<>();
		TreeSet<String> a = new TreeSet<String>();
		a.add("23410");
		a.add("210");
		a.add("310");
		a.add("1210");
		a.add("1010");
		a.remove("1010");
		Iterator<String> i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("----------");
		//HashSet<String> a1= new HashSet<String>();
		//LinkedHashSet<String> a1 = new LinkedHashSet<>();
		TreeSet<String> a1 = new TreeSet<String>();
		a1.addAll(a);
//		Iterator<String> i1=a.iterator();
//		while(i1.hasNext())
//		{
//			if(i1.next().toString().equals("210"));
//			a.remove(i1);
//		}
		
		//a1.remove(a);
		
		for(String i2:a1)
		{
			System.out.println(i2);
		}
	}

}
