package org.clc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class listTest {
	public static void main(String[]args) {
		List<Integer> anb = new ArrayList<Integer>();
		anb.add(10);
		anb.add(20);
		anb.add(30);
		anb.add(20);
		System.out.println(anb);
		
	//int sz = anb.size();
	//System.out.println(sz);
	
	//int gt = anb.get(2);
	System.out.println(anb.get(1	));
		
	//for (int i = 0; i <anb.size(); i++) {
		
	//	System.out.println(anb.get(i));
		
		
	//}
	
	
	//anb.add(3, 50);
	//System.out.println(anb);
	
	//Object rm = anb.remove(1);
	//System.out.println(anb);
	//System.out.println("Removed value is:"+rm);
	
		
	 //  anb.set(1, 25);
	  //   System.out.println(anb);
	     
	  // int iof = anb.indexOf(20);
	  //   System.out.println(iof);
	     
	  //  int liof = anb.lastIndexOf(20);
	   //  System.out.println(liof);
	     
	   //  boolean cnt = anb.contains(30);
	   //  System.out.println(cnt);
	     
	     List anb1=new ArrayList();
	     anb1.add(60);
	     anb1.add(70);
	     anb1.add(80);
	     anb1.add(40);
	    anb.addAll(anb1);
	    System.out.println(anb);
	     
	  //  anb.retainAll(anb1);
	  //  System.out.println(anb);
	     
	  //  anb.removeAll(anb1);
	   // System.out.println(anb);
	     
	     
	     
	     
	     
	     
		
	}
	

}
