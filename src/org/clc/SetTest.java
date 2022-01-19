package org.clc;

import java.net.PortUnreachableException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[]args) {
		
		Set <String>anb = new HashSet<String>();
		anb.add("Anbu");
		anb.add("Arun");
		anb.add("Jayabal");
		anb.add("Vivek");
		anb.add("Velan");
	 // for  (String anbu : anb) {
	
	//	  System.out.println(anbu);
		
	//}
		//System.out.println("Hashset :"+anb);
		
		Set anb1=new LinkedHashSet();
		anb1.add(10);
		anb1.add(20);
		anb1.add(30);
		anb1.add(40);
		anb1.add(30);
		
		anb1.addAll(anb);
		System.out.println("Linked:"+anb1);
		
		Set<String> anb2=new TreeSet<String>();
		anb2.add("Anbu");
		anb2.add("jayabal");
		anb2.add("velan");
		anb2.add("arun");
		anb2.add("vivek");
	//	System.out.println("Treeset:"+anb2);
		
		
		
		
	}

}
