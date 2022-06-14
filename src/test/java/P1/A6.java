package P1;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range of an Array");
		Scanner ss= new Scanner(System.in);
		int range=ss.nextInt();
		int a[]=new int[range];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+ (i+1)+ "th element");
			a[i]=ss.nextInt();
			
		}
		for(int i2:a)
		{
			System.out.println(i2);
		}
		
		ss.close();
		
	}

}
