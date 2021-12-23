package com.xworkz.streamdto.dto;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeadPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeadPhoneDTO dto = new HeadPhoneDTO(1, "Philips", "Wireless", 325.0);
		HeadPhoneDTO dto2 = new HeadPhoneDTO(2, "Oppo", "Wireless",1999.0);
		HeadPhoneDTO dto3 = new HeadPhoneDTO(3, "Docooler", "Wired",541.0);
		HeadPhoneDTO dto4 = new HeadPhoneDTO(4, "Sony", "Wired", 790.0);
		HeadPhoneDTO dto5 = new HeadPhoneDTO(5, "Boat Rockerz", "Wired",1299.0);
		
		Stream<HeadPhoneDTO> headPhone = Stream.of(dto,dto2,dto3,dto4,dto5);
		headPhone.filter((mod)->mod.getType().equals("Wireless")).sorted((e1,e2)->e1.getType().compareTo(e2.getType()))
		.map((h)->h.getModel()).collect(Collectors.toList())
		.forEach((p)->System.out.println(p));
		System.out.println(System.lineSeparator());
		Stream<HeadPhoneDTO> headPhone1 = Stream.of(dto,dto2,dto3,dto4,dto5);
		headPhone1.filter((mod)->mod.getType().equals("Wireless")).sorted((e1,e2)->e1.getbrandName().compareTo(e2.getbrandName())).collect(Collectors.toList()).forEach((p)->System.out.println(p));
	}
	}


