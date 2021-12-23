package com.xworkz.streamDTOapp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class River {
	public static void main(String args[]) {
	RiverDTO dto = new RiverDTO(1, "Ganga", "Uttarakhand", 2510.0, 941);
	RiverDTO dto2 = new RiverDTO(2, "Brahmaputra", "Arunachal Pradesh", 3848.0, 1045);
	RiverDTO dto3 = new RiverDTO(3, "Godavari River", "Maharashtra", 1465.0, 921);
	RiverDTO dto4 = new RiverDTO(4, "Kaveri", "Karnataka", 805.0, 3);
	RiverDTO dto5 = new RiverDTO(5, "Krishna", "Maharashtra", 1400.0, 2);
	
	Stream<RiverDTO> river = Stream.of(dto,dto2,dto3,dto4,dto5);
	river.filter((len)->len.getLength()>500).sorted((e1,e2)->e1.getNoOfDams().compareTo(e2.getNoOfDams())).collect(Collectors.toList()).forEach((p)->System.out.println(p));
	System.out.println(System.lineSeparator());
	Stream<RiverDTO> river1 = Stream.of(dto,dto2,dto3,dto4,dto5);
	river1.filter((len)->len.getLength()>500).sorted((e1,e2)->e2.getNoOfDams().compareTo(e1.getNoOfDams())).collect(Collectors.toList()).forEach((f)->System.out.println(f));
}
}
