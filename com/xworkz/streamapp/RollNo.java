package com.xworkz.streamapp;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollNo {
public static void main(String args[]) {
	Stream<Integer>rollNoStream=
			Stream.of(21,18,5,60,34,56,8,43,17,23,6,7,19,20,22,44,33,55,11,16,59,42,32,45);
	List<Integer>tempRoll=rollNoStream
			.filter((p)->p>22).sorted(Collections.reverseOrder())
			.collect(Collectors.toList());
	tempRoll.forEach((p)->System.out.println(p));
}
}
