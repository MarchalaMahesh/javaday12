package Javaday12;

public class W3 {
	public static void main(String[] args) 
	{
		int a1=20;
		
		Integer a2=a1;//boxing
		Object o =a2;
		
		Integer i =(Integer)o;
		
		int a=i;// unboxing
		System.out.println(a);
		
	}

}
