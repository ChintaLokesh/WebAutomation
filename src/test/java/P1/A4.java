package P1;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="id0019";
		String s1="";
		char ch;
		for(int count=0;count<s.length();count++)
		{
			ch=s.charAt(count);
			if(((int)ch)>=47 && ((int)ch)<=57)
				s1+=ch;
		}
		
		System.out.println(s1);
		
	}

}
