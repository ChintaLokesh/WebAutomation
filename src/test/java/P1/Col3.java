package P1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Col3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap<Integer,String> a = new HashMap<Integer,String>();
		//LinkedHashMap<Integer,String> a= new LinkedHashMap<Integer,String>();
		LinkedHashMap<String,String> a= new LinkedHashMap<String,String>();
		a.put("null", "123");
		a.put("1", "456");
		a.put("3", "456");
		a.put("null", "98675");
		System.out.println(a.size());
//		for(int i =0;i<a.size();i++)
//		{
//			System.out.println(a.get(i));
//		}
		
		Iterator<Map.Entry<String,String>> set1=a.entrySet().iterator();
		while(set1.hasNext())
		{
			Map.Entry<String,String> e=set1.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		
		
	}

}
