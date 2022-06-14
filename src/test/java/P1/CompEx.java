package P1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car 
{
	private int value;
	private String name;
	Car(int value,String name)
	{
		this.value=value;
		this.name=name;
	}
	public int getValue()
	{
		return this.value;
	}
	public String  getName()
	{
		return this.name;
	}
	
}

public class CompEx implements Comparator<Car>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(89090);
		a.add(800);
		a.add(8790);
		
		for(int i : a)
		{
			System.out.println(i);
		}
		
		Collections.sort(a);
		
		for(int i : a)
		{
			System.out.println(i);
		}
		Car c1= new Car(123,"SUMO");
		Car c2= new Car(456,"TOYOTO");
		Car c3= new Car(999,"Maruthi");
		}
		
		
		
	
		public int compare(Car o1,Car o2)
		{
			return(o1.getValue()-o2.getValue());
		}
	

	

}
