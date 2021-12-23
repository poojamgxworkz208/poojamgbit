package com.xworkz.streamDTOapp;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.xworkz.streamdto.dto.CafeDTO;

public class Cafe {
public static void main(String args[]) {
	CafeDTO dto1 = new CafeDTO(1,"Cheers Cafe","Bangalore","veg",4.3f);
	CafeDTO dto2 = new CafeDTO(2,"The Teabar","Bijapur","veg",5.0f);
	CafeDTO dto3 = new CafeDTO(3,"Brew Together","Dharawad","Nonveg",3.9f);
	CafeDTO dto4 = new CafeDTO(4,"Bistro","Gadag","veg",4.5f);
	CafeDTO dto5 = new CafeDTO();
	
	Stream<CafeDTO> cafe=
			Stream.of(dto1,dto2,dto3,dto4,dto5);
	cafe.filter((rating)->rating.getRatings()>3)
	.sorted((e1,e2)->e2.getName().compareTo(e1.getName()))
	.map((v)->v.getName()).collect(Collectors.toList())
.forEach((n)->System.out.println(n));

}

}