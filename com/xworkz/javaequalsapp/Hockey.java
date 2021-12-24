package com.xworkz.javaequalsapp;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.javaequalsapp.HockeyDTO;

public class Hockey {

	public static void main(String[] args) {
		
		HockeyDTO dto = new HockeyDTO("Newyork Iselanders", 50, 22, "Newyork");
		HockeyDTO dto1 = new HockeyDTO("Washington Capitals", 100, 19, "Washington");
		HockeyDTO dto2 = new HockeyDTO("Chicago Blackhawks", 20, 4, "Chicago");
		HockeyDTO dto3 = new HockeyDTO("Dallas Stars", 52, 12, "Dallas");
		HockeyDTO dto4 = new HockeyDTO("Green Shirts", 50, 12, "Pakistan");
		HockeyDTO dto5 = new HockeyDTO("Redsticks", 99, 18, "Spain");
		
		Set<HockeyDTO> dtos = new LinkedHashSet<HockeyDTO>();
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto1);
		dtos.add(dto);
		dtos.add(dto4);
		dtos.add(dto2);
		boolean b = dto5.equals(dto2);
		System.out.println(b);
		Optional<HockeyDTO> optional =  dtos.stream().filter((e)->e.getWins()>10).sorted((e1,e2)->e2.getTeamName().compareTo(e1.getTeamName())).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
	}
}