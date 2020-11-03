package com.nestedclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryIterator {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"csk");
		hm.put(2,"mi");
		hm.put(3,"dd");
		hm.put(4,"rcb");
		hm.put(5,"srh");
		hm.put(6,"kxip");
		hm.put(7,"kkr");
		
		Set<Map.Entry<Integer,String>> s= hm.entrySet();
	
		Iterator<Map.Entry<Integer, String>> i = s.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> entry=i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
