package com.xworkz.mapapp;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Movie {
public static void main(String args[]) {
	Map<String,Integer>movieOfRatingMap=new TreeMap<String,Integer>((a1,a2)->a2.compareTo(a1));
	
	
	movieOfRatingMap.put("Pushpa",8);
	movieOfRatingMap.put("Pooja",6);
	movieOfRatingMap.put("GGVV",9);
	movieOfRatingMap.put("ASN",10);
	movieOfRatingMap.put("Kotigobba",9);
	movieOfRatingMap.put("Yuvaratna",7);
	movieOfRatingMap.put("KGF",10);
	movieOfRatingMap.put("Drishya",7);
	movieOfRatingMap.put("Ninna Sanihake",8);
	movieOfRatingMap.put("Bhajarangi",7);
	
	
	System.out.println("List of Movies");
	Set<String> keys=movieOfRatingMap.keySet();
	keys.forEach((e)->System.out.println(e));
	
	System.out.println("===============");
	System.out.println("List of Ratings");
	Collection<Integer>values= movieOfRatingMap.values();
	values.forEach((v)->System.out.println(v));
	
	System.out.println("===============");
	System.out.println("List of Movies and Ratings");
	Set<Map.Entry<String,Integer>> entrySet=movieOfRatingMap.entrySet();
	entrySet.forEach((entry)->System.out.println(entry.getKey()+" "+entry.getValue()));
	
	System.out.println("===============");
	System.out.println("List of movies and Ratings in ascending order");
	Iterator<Map.Entry<String,Integer>> itr=entrySet.iterator();
	while(itr.hasNext()) {
		Map.Entry<String,Integer> entry=itr.next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
}
}


