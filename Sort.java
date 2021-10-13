package Javaday12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {
public static void main(String[] args) {
	ArrayList li = new ArrayList();
	li.add(10);
	li.add(56);
	li.add(87);
	li.add(12);
	System.out.println("before sorting");
	System.out.println(li);
	
	System.out.println("aftrr sorting in ascending");
	Collections.sort(li);
	System.out.println(li);
	
	System.out.println("aftrr sorting in descending");
	Collections.reverse(li);
	System.out.println(li);
	
}

}
