package com.xworkz.streamapp;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthYear {
public static void main(String args[]) {
	Stream<Integer> birthYearStream=Stream.of(1996,1997,1991,1998,1999,1996,2000,2001,2007,2002,2012,2006,2003,1991,1992);
	Set<Integer> tempPin=birthYearStream
			.filter((e)->e>1999).sorted()
			.collect(Collectors.toSet());
	tempPin.forEach((e)->System.out.println(e));
}
}
