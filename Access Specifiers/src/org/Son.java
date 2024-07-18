package org;
import com.Father;


//Accessing protected members in different class,different package
public class Son extends Father{
	public static void main(String[] args) {
		Son s =new Son ();
		System.out.println("Age"+s.age);
		System.out.println("Name :"+s.name);
	}



}


