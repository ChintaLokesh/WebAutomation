package P1;

import java.util.Arrays;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,23,45,13};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i1:a)
		{
			System.out.println(i1);
		}
	}

}
