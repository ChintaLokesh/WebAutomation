package P1;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[5][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=j+2;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
			System.out.println("-------");
		}
		
	}

}
