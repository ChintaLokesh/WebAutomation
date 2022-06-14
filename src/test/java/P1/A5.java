package P1;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Qspiders";
		String s2=s1.toUpperCase();
		String s3="";
		s3+=s1.charAt(0);
		s3=s3.toLowerCase();
		s2=s2.replace("Q", "");
		System.out.println(s2);
		s2=s3+s2;
		System.out.println(s2);
		
	}

}
