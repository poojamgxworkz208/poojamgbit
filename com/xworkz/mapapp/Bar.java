package com.xworkz.mapapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bar {
public static void main(String args[]) {
	Map<String,Integer>barOfBrandMap=new TreeMap<String,Integer>((a1,a2)->a2.compareTo(a1));
	
	
	barOfBrandMap.put("Favourite",8);
	barOfBrandMap.put("Drinks",78);
	barOfBrandMap.put("One",82);
	barOfBrandMap.put("Cheers and Beers",33);
	barOfBrandMap.put("Raise a Glass",4);
	barOfBrandMap.put("Trends",5);
	barOfBrandMap.put("Chill",84);
	barOfBrandMap.put("Time for Drinks",90);
	barOfBrandMap.put("Meeting Place",67);
	
	System.out.println("List of Bars");
	Set<String> keys=barOfBrandMap.keySet();
	keys.forEach((e)->System.out.println(e));
	
	System.out.println("===============");
	System.out.println("List of Brands");
	Collection<Integer>values= barOfBrandMap.values();
	values.forEach((v)->System.out.println(v));
	
	System.out.println("===============");
	System.out.println("List of Bars and Brands");
	Set<Map.Entry<String,Integer>> entrySet=barOfBrandMap.entrySet();
	entrySet.forEach((entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
	
	System.out.println("===============");
	System.out.println("List of Bars and Brands in ascending order");
	Iterator<Map.Entry<String,Integer>> itr=entrySet.iterator();
	while(itr.hasNext()) {
		Map.Entry<String,Integer> entry=itr.next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
}
}

