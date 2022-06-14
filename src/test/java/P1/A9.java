package P1;

import java.util.Arrays;

public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {123,1,23,4,5,99};
		for(int i:a)
			System.out.println(i);
		Arrays.sort(a);
		for(int i:a)
			System.out.println(i);
		System.out.println(a[a.length-1]);
	}

}
