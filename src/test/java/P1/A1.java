package P1;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java";
		String s1="";
		System.out.println(s);
		char ch;
		for(int count=0;count<s.length();count++)
		{
			ch=s.charAt(count);
			s1+=ch;
		}
		
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equals");
		}
		
	}

}
