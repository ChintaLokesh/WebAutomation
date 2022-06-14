package P1;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="developer";
		String s1="";
		char ch;
		for(int count=0;count<s.length();count++)
		{
			ch=s.charAt(count);
			if(s1.indexOf(ch) == -1)
				s1+=ch;
		}

		System.out.println(s1);
	}

}
