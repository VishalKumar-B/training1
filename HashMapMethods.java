package com.Jnit.training;

import java.util.HashMap;

public class HashMapMethods {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"csk");
		hm.put(2,"mi");
		hm.put(3,"rr");
		hm.put(4,"srh");
		hm.put(5,"dd");
		hm.put(6,"kxip");
		hm.put(7,"kkr");
		System.out.println(hm);
		System.out.println(hm.size());			//show the size of HashMap
		System.out.println(hm.isEmpty());		//it checks whether HashMap empty or not
		System.out.println(hm.containsKey(2));		//it checks whether key present or not
		System.out.println(hm.containsValue("srh"));	//it checks whether Value present or not
		hm.replace(4, "srh", "qualified");		//Replace the value
		System.out.println(hm);
		hm.clear();					//it clears the data
	}

}