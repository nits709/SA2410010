package com.SA2410010_Automation_selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set_java {

	public static void main(String[] args) {
		
		// set does accepts duplicate value 
		// does not have final size like list
		// no index 
		// no order in set.
		Set<String> s = new HashSet<String>();
		System.out.println("size "+ s.size());
		
		s.add("India");
		s.add("USA");
		s.add("London");
	
		
		System.out.println("size "+ s.size());
		
		Iterator<String> t = s.iterator();
		
//		System.out.println(t.next());
//		System.out.println(t.next());
//		System.out.println(t.next());
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
		
		
		
		
		
	}
}
