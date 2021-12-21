package com.xworkz.streamapp;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmPinCode {
	public static void main(String args[]) {
		Stream<Integer>atmPinCodeStream=
				Stream.of(2321,4318,5355,0560,0544,4456,8997,4317,2367,1920,2244,3355,1116,5942,3245);
		List<Integer>tempAtm=atmPinCodeStream
				.filter((p)->p>2000).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		tempAtm.forEach((p)->System.out.println(p));
	}
	
}
