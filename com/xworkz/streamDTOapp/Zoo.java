package com.xworkz.streamDTOapp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zoo {
	public static void main (String args[]) {
	ZooDTO zooDTO=new ZooDTO(1,"Mini Deer Park","Chikmagalur",50);
	ZooDTO zooDTO1=new ZooDTO(2,"Karadigudda Deer Park","Karjagi",0);
	ZooDTO zooDTO2=new ZooDTO(3,"Lalbagh Derr Park","Bengaluru",10);
	ZooDTO zooDTO3=new ZooDTO(4,"Kudremukh Mini Zoo","India",200);
	ZooDTO zooDTO4=new ZooDTO(5,"Bannerghatta Biological Park","Bengaluru",100);
	
	System.out.println("Zoo Details");
	
	Stream<ZooDTO> zoo1=Stream.of(zooDTO,zooDTO1,zooDTO2,zooDTO3,zooDTO4);
	zoo1.filter((pa)->pa.getTicketPrice()>80).sorted((e1,e2)->e2.getTicketPrice().compareTo(e1.getTicketPrice()))
	.collect(Collectors.toList())
	.forEach((p)->System.out.println(p));
}
}
