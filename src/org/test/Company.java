package org.test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Company  {
	
	public static void main(String[] args) {
		
		Map<String, Integer> m = new LinkedHashMap();
		
		m.put("csk", 500);
		m.put("rcb", 400);
		m.put("kkr", 300);
		m.put("srh", 400);
		m.put("mi", 100);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
		}
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getValue());
		}
		
	
	}
	
}

