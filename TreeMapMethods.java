package com.Jnit.training;

import java.util.TreeMap;

public class TreeMapMethods {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1,"csk");
		tm.put(2,"mi");
		tm.put(3,"rcb");
		tm.put(4,"srh");
		tm.put(5,"dd");
		tm.put(6,"kxip");
		tm.put(7,"kkr");
		System.out.println(tm);
		System.out.println(tm.size());				//show the size of HashMap
		System.out.println(tm.isEmpty());			//checks whether HashMap empty or not
		System.out.println(tm.containsKey(2));			//checks whether key present or not
		System.out.println(tm.containsValue("srh"));		//checks whether Value present or not
		tm.replace(4, "srh", "qualified");			//Replace the value
		System.out.println(tm);
		System.out.println(tm.subMap(2,false, 4,true));		//shows the subMap of map
		System.out.println(tm.headMap(5,true));			//shows head of the map
		System.out.println(tm.tailMap(4,false));		//shows tail of the map
		tm.clear();						//clears the data
	}
}
