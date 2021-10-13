package Javaday12;

public class UnBoxing {
	public static void main(String[] args) {
		Integer i =100;
		
		int i1 = i.intValue();// excplicit unboxing
		System.out.println(i1);// 100
		
		Character c ='a';
		char c1 = c.charValue();// exclipicit unboxing
		System.out.println(c1);
		
		Integer a =20;
		int a1=a;
		System.out.println(a1);
		
	}

}
