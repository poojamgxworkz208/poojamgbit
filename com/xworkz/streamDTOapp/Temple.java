package com.xworkz.streamDTOapp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Temple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempleDTO templeDTO=new TempleDTO(21,"Murudeshwara Temple","Bhatkal","Shiva",1400);
		TempleDTO templeDTO1=new TempleDTO(22,"Tirupati","Tirupati","VenkataRamana", 12500);
		TempleDTO templeDTO2=new TempleDTO(23,"Shree Banashankari","Badami","Shakambari", 5000);
		TempleDTO templeDTO3=new TempleDTO(24,"Shree Mahaganapati ","Malleshwaram","Gajanana", 18000);
		TempleDTO templeDTO4=new TempleDTO(25,"Udupi Shree Krishna","Udupi","ShreeKrishna", 61000);
		
		System.out.println("Temple Details");
		Stream<TempleDTO> templeDTOs=Stream.of(templeDTO,templeDTO1,templeDTO2,templeDTO3,templeDTO4);	
		
		templeDTOs
		.filter((a)->a.getVisitors()>10000)
		.sorted((a1,a2)->a2.getVisitors().compareTo(a1.getVisitors()))
		.collect(Collectors.toList()).forEach((a)->System.out.println(a));
         System.out.println(System.lineSeparator());
	}

}
