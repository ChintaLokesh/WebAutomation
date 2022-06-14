package P1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Col4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> a = new TreeMap<Integer,String>();
		a.put(1, "345");
		a.put(0, "2345");
		
		Iterator<Map.Entry<Integer,String>> it=a.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> a1 = it.next();
			System.out.println(a1.getKey());
			System.out.println(a1.getValue());
		}
		
	}

}
