package P1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Col5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(20);
		a.add(40);
		ListIterator<Integer> it=a.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("---------");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
	}

}
