package Javaday12;

public class W4 {
	public static void main(String[] args) 
	{
		// convert int to string
		int a=20;
		String s = String.valueOf(a);
		System.out.println(s);//20
		s=s+20;
		System.out.println(s);//2020
		
		// convert char to int 
		char c='a';
		 int a1 =Integer.valueOf(c);
		 System.out.println(a1);
		 
		 // convert char to String
		 
		 char c1='x';
		 String s1 = String.valueOf(c1);
		 System.out.println(s1);
		 
		 boolean b =true;
		 String s2 = String.valueOf(b);
		 System.out.println(s2);
		 
		 
		 
		 
		 // convert string to int 
		 
		 String s3="100";
		 int a3 = Integer.parseInt(s3);
		 System.out.println(a3);
		 
		 // convert string to char
		 
		 String s4="100";
		 char c2 = s4.charAt(0);;
		 System.out.println(c2);
		 
				 
		 
		 
		 
		 
		 
		 
	}

}
