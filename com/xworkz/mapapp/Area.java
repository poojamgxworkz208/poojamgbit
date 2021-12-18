package com.xworkz.mapapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Area {
public static void main(String args[]) {
	Map<String,Integer>areaOfDimensionMap=new TreeMap<String,Integer>((a1,a2)->a2.compareTo(a1));
	
	areaOfDimensionMap.put("Mantri square",9300);
	areaOfDimensionMap.put("Orion",8300);
	areaOfDimensionMap.put("Kushi PG",67700);
	areaOfDimensionMap.put("Barakaman",76890);
	areaOfDimensionMap.put("Gol Gumbaz",78430);
	areaOfDimensionMap.put("Shastri Market",3456700);
	areaOfDimensionMap.put("Taj Mahal",87654533);
	areaOfDimensionMap.put("Pub",8664333);
	areaOfDimensionMap.put("Mantap",459300);
	areaOfDimensionMap.put("Yaranal",93007890);
	
	System.out.println("List of Areas");
	Set<String> keys=areaOfDimensionMap.keySet();
	keys.forEach((e)->System.out.println(e));
	
	System.out.println("===============");
	System.out.println("List of Dimensions");
	Collection<Integer>values= areaOfDimensionMap.values();
	values.forEach((v)->System.out.println(v));
	
	System.out.println("===============");
	System.out.println("List of Areas and Dimensions");
	Set<Map.Entry<String,Integer>> entrySet=areaOfDimensionMap.entrySet();
	entrySet.forEach((entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
	
	System.out.println("===============");
	System.out.println("List of Areas and Dimensions in Descending order");
	Iterator<Map.Entry<String,Integer>> itr=entrySet.iterator();
	while(itr.hasNext()) {
		Map.Entry<String,Integer> entry=itr.next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
}
}
