package P1;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc abc abc 123";
		//System.out.println(A2.getWordCount(s, "123"));
		System.out.println(A2.getUniqueWordCount(s, "abc"));
	}
	
	public static  int getWordCount(String s,String s1)
	{
		s=s.replaceAll(s1, "X");
		System.out.println(s.length());
		String s2=s.replace("X", "");
		System.out.println(s2.length());
		return(s.length()-s2.length());
	}

	
	public static String getUniqueWordCount(String s,String s1)
	{
		String s3[]=s.split(" ");
		String s4="";
		for(int count=0;count<s3.length;count++)
		{
			if(!s4.contains(s3[count]))
			s4+=s3[count]+" ";
		}
		return s4;
		
	}
}
