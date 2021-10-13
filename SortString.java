package Javaday12;

import java.util.ArrayList;
import java.util.Collections;

public class SortString 
{
	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		li.add(new c4("sheela",876));
		li.add(new c4("lela",456));
		li.add(new c4("mala",4567));
		Collections.sort(li);
		System.out.println(li);
		
		
		for(Object o:li)
		{
			((c4)o).display();
		}
		
	}
}
class c4 implements Comparable
{
	String name;
	double salary;
	public c4(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
public int compareTo(Object o)
{
	c4 temp = (c4)o;
	if(this.salary==temp.salary)
	{
		return 0;
	}
	else if(this.salary>temp.salary)
	{
		return 1;
	}
	else
	{
		return -1;
	}
	
}
public void display()
{
	System.out.println(name);
	System.out.println(salary);
	
}
}
