package com.prototypedesignpattern;

import java.util.HashMap;
import java.util.Map;

public class ColorStorage {

	private static Map<String, Color> colorMap = new HashMap<String, Color>();
	
	static 
    { 
        colorMap.put("blue", new Blue()); 
        colorMap.put("orange", new Orange()); 
    } 
       
    public static Color getColor(String colorName) 
    { 
        return (Color) colorMap.get(colorName).clone(); 
    } 
}
