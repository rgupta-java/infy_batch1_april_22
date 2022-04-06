package com.demo_map;
import java.util.*;
public class DemoMap {

	public static void main(String[] args) {
		//HashMap vs LinkedHashMap vs TreeMap vs Hashtable (XX)
		
		//HashMap: dont maintain the insertion order while printing
		
		//LinkedHashMap:  maintain the insertion order while printing
		
		//TreeMap:  red black Algo, it will give result in sorted order
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		map.put("ekta", 78);
		map.put("ekta", 98);// we will not any errror, infact 78==> 98
		map.put(null, 78);
		map.put("suman", 88);
		map.put("gunika", 98);
		map.put("raj", 100);
	
		System.out.println(map);
		
	}
}
