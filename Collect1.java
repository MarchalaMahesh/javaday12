package Javaday12;

import java.util.ArrayList;
import java.util.Iterator;

public class Collect1 {
	public static void main(String[] args)
	{
		ArrayList li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		int key=20;
		
		System.out.println(li);
		// printing the elements by own 
		/* for(int i=0;i<li.size();i++)
		{
			int temp = (Integer)li.get(i);
			System.out.println(temp);
}		 
		/* System.out.println(li.contains(20));
		
		System.out.println(li.indexOf(20));
		
		System.out.println(li.isEmpty());
		System.out.println(li.size()); */
		
		/* Iterator i = li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			li.remove(0);
		} */
		int sum=0;
		for(Object o:li)
		{
			int temp = (Integer)o;
			sum=sum+temp;
		}
		System.out.println(sum);
		
	}
	

}
