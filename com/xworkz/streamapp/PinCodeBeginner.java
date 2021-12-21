package com.xworkz.streamapp;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PinCodeBeginner {
public static void main(String args[]) {
	Stream<Integer> pincodeStream=
			Stream.of(586122,586121,577201,561232,560002,580123);
	Set<Integer>tempList=pincodeStream
			.filter((p)->p>580000)
			.collect(Collectors.toSet());
	tempList.forEach((p)->System.out.println(p));
}
}
