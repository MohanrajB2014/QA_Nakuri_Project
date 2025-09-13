package com.map_type;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Type {
	
public static void Type_1 () {
Map<Integer, String> m = new HashMap <Integer , String >();
m.put(1 , "Mohanraj");
m.put(2 , "Vijay");
m.put(3 , "Ajith");
m.put(4 , "Simbu");
m.put(5 , "surya");
m.put(6 , null);
m.put(7 , null);
 
System.out.println(m);
System.out.println("");

System.out.println("***Size***");
int size = m.size();
System.out.println(size);
System.out.println("");

System.out.println("***Get***");
String string = m.get(4);
System.out.println(string);
System.out.println("");

System.out.println("***Key Set***");
Set<Integer> keySet = m.keySet();
System.out.println(keySet);
System.out.println("");

System.out.println("***Values***");
Collection<String> values = m.values();
System.out.println(values);
System.out.println("");

System.out.println("***Contains Key***");
boolean containsKey = m.containsKey(5);
System.out.println(containsKey);
System.out.println("");

System.out.println("***Contains Value***");
boolean containsValue = m.containsValue("Mohanraj");
System.out.println(containsValue);
System.out.println("");

System.out.println("***Entry Set***");
Set<Entry<Integer, String>> entrySet = m.entrySet();
System.out.println(entrySet);
System.out.println("");

System.out.println("After Entry set we use for each loop for line by line Output");
for (Entry<Integer, String> entry : entrySet) {
	System.out.println(entry);
}
}

public static void Type_2() {
	Map<Integer, String> m1 = new LinkedHashMap <Integer , String >();
	m1.put(1 , "Mohanraj");
	m1.put(2 , "Vijay");
	m1.put(3 , "Ajith");
	
System.out.println(m1);
System.out.println("");

System.out.println("***Entry Set***");
Set<Entry<Integer, String>> entrySet = m1.entrySet();
System.out.println(entrySet);
System.out.println("");

System.out.println("***Foreach loop***");
for (Entry<Integer, String> entry : entrySet) {
	System.out.println(entry);
}
}
public static void main(String[] args) {
//	Type_1();
	Type_2();
}
}