package com.list_type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist_Type {
	private static int m;
	public static void Arraylist() {
		List <Integer> mm = new ArrayList <Integer> ();
		mm.add(55555);
		mm.add(44444);
		mm.add(33333);
		mm.add(22222);
		mm.add(11111);
		System.out.println(mm);
		
		System.out.println("");
		System.out.println("***Size***");
		int size = mm.size();
		System.out.println(size);
		System.out.println("");
		
		System.out.println("***Get***");
		Integer integer = mm.get(4);
		System.out.println(integer);
		System.out.println("");
		
		System.out.println("***Set***");
		Integer set = mm.set(0, 88888);
		System.out.println(set);
		System.out.println("");
		
		System.out.println("***Remove***");
		Integer remove = mm.remove(3);
		System.out.println(remove);
		System.out.println("");
		
		System.out.println("***Indexof***");
		int indexOf = mm.indexOf(88888);
		System.out.println(indexOf);
		System.out.println("");
		
		System.out.println("***Contains***");
        boolean contains = mm.contains(11111);
        System.out.println(contains);
        System.out.println("");
        
//        System.out.println("***Clear***");
//        mm.clear();
//        System.out.println(mm);
//        System.out.println("");
		
		System.out.println("***For Loop");
		for(int m = 0 ; m < mm.size(); m++ ) {
		System.out.println(mm.get(m));
		}
		System.out.println("");
		
		System.out.println("***For Each***");
		for (Integer Datas : mm) {
	    System.out.println(Datas);
		}
		System.out.println("");
		
		System.out.println("***Using Iterator***");
		Iterator<Integer> mmm = mm.iterator();
		while(mmm.hasNext()) {
			System.out.println(mmm.next());
		}
		System.out.println("");
		
		
		List <Integer> ll =  new ArrayList<Integer>();
		ll.add(99999);
		ll.add(77777);
		ll.add(66666);
		
		System.out.println("***Add All***");
		mm.addAll(ll);
		System.out.println(mm);
		System.out.println("");
		
		System.out.println("***Retain All ( Common values only showed here ) ***");
		mm.retainAll(ll);
		System.out.println(mm);
		System.out.println("");
		
		System.out.println("***Remove ALl***");
		mm.removeAll(ll);
		System.out.println(mm);
		System.out.println("");
	}
	
	public static void Type_2() {
    List <Object> k = new ArrayList<Object>();
    k.add("mohan");
    k.add("mohannraj");
    
    System.out.println(k);
	}
public static void main(String[] args) {
	Arraylist();
	Type_2();
}
}
