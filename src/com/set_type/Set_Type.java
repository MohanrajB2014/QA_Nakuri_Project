package com.set_type;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {
	
	public static void Type_1 () {
		Set <Object> m = new HashSet <Object>();
		m.add(11.001);
		m.add(22.002);
		m.add(33.003);
		m.add(44.004);
		m.add(55.005);
		
		System.out.println("***Size***");
		int size = m.size();
		System.out.println(size);
		System.out.println("");
		
		System.out.println("***Remove***");
	    boolean remove = m.remove(22.002);
		System.out.println(remove);
		System.out.println("");
		
		System.out.println("***Contains***");
		m.contains(m);
		System.out.println(m);
		System.out.println("");
		
		System.out.println("***Clear***");
//		m.clear();
//		System.out.println(m);
		System.out.println("");
		
		Set<Object> mm = new HashSet<Object>();
		mm.add(66.006);
		mm.add(77.007);
		mm.add(88.008);
		
		System.out.println("***Add All***");
		m.addAll(mm);
		System.out.println(m);
		System.out.println("");
		
		System.out.println("***Retain All***");
		m.retainAll(mm);
		System.out.println(m);
		System.out.println("");
		
		System.out.println("***Remove All***");
		m.removeAll(mm);
		System.out.println(m);
		System.out.println("");
		System.out.println("------------------------------------------------------------------------------------");
		}
	public static void Type_2() {
		Set<Object> i = new LinkedHashSet<Object>();
		i.add("Vijay");
		i.add("Ajith");
		i.add("Surya");
		i.add("Simbu");
		i.add(null);
		System.out.println(i);
	}
	public static void Type_3() {
		Set<Object> h = new TreeSet<Object>();
//		h.add("Mohan");
		h.add(333);
//		h.add("love");
//	    h.add("You");
	    h.add(222);
	    h.add(888);
//		h.add(null);
		
		System.out.println(h);
	}
	
    public static void main(String[] args) {
//    Type_1();
//    Type_2();
//    Type_3();
    	
}
}
