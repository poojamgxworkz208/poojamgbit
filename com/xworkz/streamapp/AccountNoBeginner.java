package com.xworkz.streamapp;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccountNoBeginner {
public static void main(String args[]) {
	Stream<Long> accountNoStream=
Stream.of(3456798L,34567896L,4567890876L,4587654443L,267887877L,33334446L,1234567654L,13424433L);
Set<Long> accountNo=accountNoStream
.filter((a)->a<33456789)
		.collect(Collectors.toSet());
accountNo.forEach((a)->System.out.println(a));
}
}
